package com.skilldistillery.stringstringbuilder.drills;

public class UserComment {

private int commentId;
  private UserComment inReplyToComment;
  private String date;
  private String time;
  private String userName;
  private String commentText;
  
  public UserComment(int commentId, UserComment inReplyToComment, String date, String time, String userName,
      String commentText) {
    super();
    this.commentId = commentId;
    this.inReplyToComment = inReplyToComment;
    this.date = date;
    this.time = time;
    this.userName = userName;
    this.commentText = commentText;
  }

  public UserComment getInReplyToComment() {
    return inReplyToComment;
  }

  public void setInReplyToComment(UserComment inReplyToComment) {
    this.inReplyToComment = inReplyToComment;
  }

  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public String getTime() {
    return time;
  }

  public void setTime(String time) {
    this.time = time;
  }

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public String getCommentText() {
    return commentText;
  }

  public void setCommentText(String commentText) {
    this.commentText = commentText;
  }
  
  public String toString() {
	  StringBuilder builder = new StringBuilder();
	  builder.append("On ");
	  builder.append(date);
	  builder.append(" at ");
	  builder.append(time);
	  builder.append(" ");
	  builder.append(userName);
	  builder.append(" posted this comment: [");
	  builder.append(commentText);
	  builder.append("]");
	  return builder.toString();
  }

  public int getCommentId() {
    return commentId;
  }
  
//  On 2018-01-04 at 14:59:23, bdobbs posted this comment: [I love coding in Java!]



}
