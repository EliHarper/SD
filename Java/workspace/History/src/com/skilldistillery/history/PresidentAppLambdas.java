package com.skilldistillery.history;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PresidentAppLambdas {
	private static final String fileName = "resources" + File.separator + "presidents.tsv";
	private List<President> presidents = new ArrayList<>();

	public static void main(String[] args) {
		PresidentAppLambdas app = new PresidentAppLambdas();
		app.start();
	}

	public void start() {
		// this.printPresidents(this.getPresidents());

		List<President> byPartyAndTerm = sortByPartyAndTerm(presidents);
		System.out.println("******** By Party And Term *********");
		printPresidents(byPartyAndTerm);
		System.out.println("******** By Why Left And Term *********");
		printPresidents(sortByReasonLeftOfficeAndTerm(presidents));
		System.out.println("******** By Last Name *********");
		printPresidents(sortByLastName(presidents));
//		List<President> firstNames = filter("Ge", new FirstNameStartsWith());
		System.out.println("******** Filtered First Name StartsWith *********");
//		printPresidents(firstNames);
		System.out.println("******** Filtered Why Left Office *********");
		
		List<President> whyLefts = filter("term ended", (pres, string) -> pres.getWhyLeftOffice().equalsIgnoreCase(string));
		printPresidents(whyLefts);

		List<President> cNames = filter("C", (pres, string) -> pres.getLastName().startsWith(string));
		
		System.out.println("******** Filtered C Names *********");
		printPresidents(cNames);

		List<President> party = filter("Democrat", (pres, string) -> pres.getParty().startsWith(string));
			
		System.out.println("******** Filtered Party *********");
		printPresidents(party);

		System.out.println("******** Filtered Died *********");
		printPresidents(filter("Died in office", (pres, string) -> pres.getWhyLeftOffice().equalsIgnoreCase(string)));

		System.out.println("******** Filtered 1 Election *********");
		printPresidents(filter("1", (pres, string) -> {
			int electionsWon = pres.getElectionsWon();
			int electionsWonParameter = Integer.parseInt(string);
			return electionsWon == electionsWonParameter;
		}));

		System.out.println("******** Filtered 1800's Presidency *********");
//		printPresidents(filter("18", (pres, string) -> {
//			int electionYearCentury = Integer.parseInt(string);
//			electionYearCentury = electionYearCentury * 100;
//
//			LocalDate termBegin = pres.getTermBegan();
//			int termBeginYear = termBegin.getYear();
//			boolean isInCentury = false;
//			if (termBeginYear >= electionYearCentury && termBeginYear < electionYearCentury + 100) {
//				isInCentury = true;
//		}
//		}));

//	private class FirstNameStartsWith implements PresidentMatcher {
//		@Override
//		public boolean matches(President pres, String string) {
//			return pres.getFirstName().startsWith(string);
//		}
//	}

	}

	private List<President> sortByLastName(List<President> presidents) {
		List<President> sorted = new ArrayList<>(presidents);

		Comparator<President> cp = new Comparator<President>() {

			@Override
			public int compare(President o1, President o2) {
				return o1.getLastName().compareTo(o2.getLastName());
			}
		};
		Collections.sort(sorted, cp);
		return sorted;
	}

	public PresidentAppLambdas() {
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
		DateTimeFormatter df = DateTimeFormatter.ofPattern("MMMM d, yyyy");
		try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
			String record = reader.readLine(); // Read and discard header line
			while ((record = reader.readLine()) != null) {
				String[] col = record.split("\\t");

				int term = Integer.parseInt(col[0]);
				String fName = col[1];
				String mName = col[2];
				String lName = col[3];
				// col[4]: Date term began.
				// col[5]: Date term ended.
				String startStr = col[4];
				String endStr = col[5];

				LocalDate startDt = LocalDate.parse(startStr, df);
				LocalDate endDt = null;
				if (endStr != null && !"".equals(endStr)) {
					endDt = LocalDate.parse(endStr, df);
				}

				int won = Integer.parseInt(col[6]);
				String whyLeft = col[7];
				String party = col[8];
//				President pres = new President(term, fName, mName, lName, won, whyLeft, party, startDt, endDt);
//				presidents.add(pres);
			}
		} catch (IOException ioe) {
			ioe.printStackTrace();
			System.exit(1);
		}
	}

	public List<President> sortByPartyAndTerm(List<President> presidents) {
		List<President> sorted = new ArrayList<>(presidents);
		PartyAndTermComparator p = new PartyAndTermComparator();
		// Sort the List using the Comparator
		Collections.sort(sorted, p);

		return sorted;
	}

	public List<President> sortByReasonLeftOfficeAndTerm(List<President> presidents) {
		List<President> sorted = new ArrayList<>(presidents);
		Comparator<President> p = new Comparator<President>() {
			@Override
			public int compare(President o1, President o2) {
				int result = o1.getWhyLeftOffice().compareTo(o2.getWhyLeftOffice());
				if (result != 0) {
					return result;
				}
				Integer t1 = o1.getTermNumber();
				Integer t2 = o2.getTermNumber();
				return t1.compareTo(t2);
			}
		};

		Collections.sort(sorted, p);

		return sorted;
	}

	// Member class implementing Comparator<President> sorting by party and term
	// number
	private class PartyAndTermComparator implements Comparator<President> {
		@Override
		public int compare(President o1, President o2) {
			// compare the two President's partys (sic)
			String o1Party = o1.getParty();
			String o2Party = o2.getParty();
			int result = o1Party.compareTo(o2Party);

			if (result == 0) {
				// if they are they same, compare the presidents term numbers
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
}