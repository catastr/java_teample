package Employ;

public class EmInfo {
    private String companyName;
    private String Title;
    private String Task; 
    private String Requirements; 
    private String startDate; 
    private String endDate;
	
	@Override
	public String toString() {
		return "EmInfo [companyName=" + companyName + ", Title=" + Title + ", Description=" + Task
				+ ", Requirements=" + Requirements + "startDate= " + startDate
				+ ", endDate=" + endDate + "]";
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		Title = title;
	}
	public String getDescription() {
		return Task;
	}
	public void setDescription(String description) {
		Task = description;
	}
	public String getRequirements() {
		return Requirements;
	}
	public void setRequirements(String requirements) {
		Requirements = requirements;
	}
	
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
    


	
	

}
