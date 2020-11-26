package jspservlet.vo;

public class UserSearch {
private String content; //Content of users' search.
private String sortMode; //Default Mode/Latest Released.
private String fliter; //Features.
private String username;

public String getContent() {
	return content;
}
public void setContent(String content) {
	this.content = content;
}
public String getSortMode() {
	return sortMode;
}
public void setSortMode(String sortMode) {
	this.sortMode = sortMode;
}
public String getFliter() {
	return fliter;
}
public void setFliter(String fliter) {
	this.fliter = fliter;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}

}
