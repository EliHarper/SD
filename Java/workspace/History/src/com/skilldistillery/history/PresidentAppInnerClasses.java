package com.skilldistillery.history;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class PresidentAppInnerClasses {
	private static final String fileName = "resources" + File.separator + "presidents.tsv";
	private List<President> presidents = new ArrayList<>();

	public static void main(String[] args) {
		PresidentAppInnerClasses app = new PresidentAppInnerClasses();
		app.start();
	}

	public void start() {
		this.printPresidents(this.getPresidents());

		List<President> byPartyAndTerm = sortByPartyAndTerm(presidents);
		System.out.println("************ By Party And Term *************");
		printPresidents(byPartyAndTerm);

		List<President> byWhyLeftOffice = sortByWhyLeftOfficeAndTerm(presidents);
		System.out.println("\n\n************ By Why Left Office ************\n");
		printPresidents(byWhyLeftOffice);

		List<President> byLastName = sortByLastName(presidents);
		System.out.println("\n\n************ By Last Name ***********\n");
		printPresidents(byLastName);

		System.out.println("\n\n************* Whigs ***************\n");
		printPresidents(filter("Whig", (p, s) -> p.getParty().equalsIgnoreCase(s)));

		System.out.println("\n\n*************** Joh names *************\n");
		printPresidents(filter("Joh", (p, s) -> p.getFirstName().startsWith(s)));
		
		System.out.println("\n\n************** Died in office *************\n");
		printPresidents(filter("Died in office", (p, s) -> p.getWhyLeftOffice().equalsIgnoreCase(s)));
		
		System.out.println("\n\n*************** Filtered 1 Election ****************\n");
		printPresidents(filter("1", (p, s) -> p.getElectionsWon() == Integer.parseInt(s)));

		class localWhyTheyLeft implements PresidentMatcher {

			List<President> allPresidents = new ArrayList<>(presidents);

			@Override
			public boolean matches(President pres, String string) {
				if (pres.getWhyLeftOffice().equals(string)) {
					return true;
				}
				return false;
			}

			public List<President> termEnded() {
				for (President president : presidents) {
					if (!matches(president, "Term ended")) {
						allPresidents.remove(president);
					}
				}
				return allPresidents;
			}

		}

		System.out.println("\n\n*********** Left after Term ***********\n");
		localWhyTheyLeft local = new localWhyTheyLeft();
		printPresidents(local.termEnded());
		
		PresidentMatcher m = new PresidentMatcher() {

			@Override
			public boolean matches(President pres, String string) {
				if (pres.getLastName().startsWith(string)) {
					return true;
				}
				return false;
			}
		
		};
		
		List<President> startsWithC = filter("C", m);
		System.out.println("\n\n********** Starts with C *********\n");
		printPresidents(startsWithC);
	}

	public PresidentAppInnerClasses() {
		this.loadPresidents(fileName);
	}

	public List<President> getPresidents() {
		return this.presidents;
	}

	public void printPresidents(List<President> pres) {
		for (President p : pres) {
			System.out.println(p);
		}
	}

	public List<President> filter(String string, PresidentMatcher matcher) {
		List<President> filtered = new ArrayList<>();
		for (President p : presidents) {
			if (matcher.matches(p, string)) {
				filtered.add(p);
			}
		}
		return filtered;
	}

	private void loadPresidents(String fileName) {
		// File format (tab-separated):
		// # First Middle Last Inaugurated Left office Elections won Reason left office
		// Party
		// 1 George Washington July 1, 1789 March 4, 1797 2 Did not seek re-election
		// Independent
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MMMM d, yyyy");
		try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
			String record = reader.readLine(); // Read and discard header line
			while ((record = reader.readLine()) != null) {
				String[] col = record.split("\\t");

				int term = Integer.parseInt(col[0]);
				String fName = col[1];
				String mName = col[2];
				String lName = col[3];
				String termBeginStr = col[4]; // Date term began.
				LocalDate termBegin = LocalDate.parse(termBeginStr, dtf);
				String termEndStr = col[5]; // Date term ended.
				LocalDate termEnd = LocalDate.parse(termEndStr, dtf);
				int won = Integer.parseInt(col[6]);
				String whyLeft = col[7];
				String party = col[8];

				President pres = new President(term, fName, mName, lName, termBegin, termEnd, won, whyLeft, party);
				presidents.add(pres);
			}
		} catch (IOException ioe) {
			ioe.printStackTrace();
			System.exit(1);
		} catch (DateTimeParseException dtp) {
			System.err.println("Input file includes invalid or missing date(s).\n");
			// System.exit(0);
		}
	}

	public List<President> sortByPartyAndTerm(List<President> presidents) {
		List<President> sorted = new ArrayList<>(presidents);
		PartyAndTermComparator p = new PartyAndTermComparator();
		Collections.sort(sorted, p);

		return sorted;
	}

	class PartyAndTermComparator implements Comparator<President> {

		@Override
		public int compare(President o1, President o2) {
			String o1Party = o1.getParty();
			String o2Party = o2.getParty();
			int result = o1Party.compareTo(o2Party);

			if (result == 0) {
				int o1Term = o1.getTermNumber();
				int o2Term = o2.getTermNumber();
				if (o1Term < o2Term) {
					return -1;
				}
				else
					if (o1Term > o2Term) {
						return 1;
					}
			}
			return result;
		}

	}

	public List<President> sortByWhyLeftOfficeAndTerm(List<President> presidents) {
		List<President> sorted = new ArrayList<>(presidents);

		class ByWhyLeftOfficeAndTermComparator implements Comparator<President> {

			public int compare(President p1, President p2) {
				String p1WhyLeft = p1.getWhyLeftOffice();
				String p2WhyLeft = p2.getWhyLeftOffice();
				int result = p1WhyLeft.compareTo(p2WhyLeft);

				if (result == 0) {
					int p1Term = p1.getTermNumber();
					int p2Term = p2.getTermNumber();
					if (p1Term < p2Term) {
						return -1;
					}
					else
						if (p1Term > p2Term) {
							return 1;
						}
				}
				return result;
			}
		}
		Comparator<President> c = new ByWhyLeftOfficeAndTermComparator();
		Collections.sort(sorted, c);
		return sorted;
	}

	public List<President> sortByLastName(List<President> presidents) {

		List<President> sorted = new ArrayList<>(presidents);
		Comparator<President> byLastNameComparator = new Comparator<President>() {

			public int compare(President p1, President p2) {
				String p1LastName = p1.getLastName();
				String p2LastName = p2.getLastName();
				int result = p1LastName.compareTo(p2LastName);

				if (result == 0) {
					int p1Term = p1.getTermNumber();
					int p2Term = p2.getTermNumber();
					if (p1Term < p2Term) {
						return -1;
					}
					else
						if (p1Term > p2Term) {
							return 1;
						}
				}
				return result;
			}
		};
		Collections.sort(sorted, byLastNameComparator);
		return sorted;
	}

	public List<President> whigMatcher() {
		PresidentPartyMatcher ppm = new PresidentPartyMatcher();
		List<President> whigs = filter("whig", ppm);
		return whigs;
	}

	public class firstNameMatcherClass implements PresidentMatcher {
		List<President> allPresidents = new ArrayList<>(presidents);

		@Override
		public boolean matches(President pres, String string) {
			if (pres.getFirstName().contains(string)) {
				return true;
			}
			return false;
		}

		public List<President> removeNonMatches() {
			for (President president : presidents) {
				if (!matches(president, "Joh")) {
					allPresidents.remove(president);
				}

			}
			return allPresidents;
		}

	}
}