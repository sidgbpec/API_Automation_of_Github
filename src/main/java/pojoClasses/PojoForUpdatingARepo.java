package pojoClasses;

public class PojoForUpdatingARepo 
{
	//String name;
	String description;
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	/*String homepage;
	//actual is private but as it is reserved keyword we are changing name to privateOrPersonal
	Boolean privateOrPersonal;
	//	Can be one of: public, private
	String visibility;
	//	For example, to enable GitHub Advanced Security, use this data in the body of the PATCH request: 
	//{ "security_and_analysis": {"advanced_security": { "status": "enabled" } } }.
	Object security_and_analysis;
	//	Default: true
	Boolean has_issues;
	Boolean has_projects;
	Boolean has_wiki;
	Boolean is_template;
	String default_branch;
	Boolean allow_squash_merge;
	Boolean allow_rebase_merge;
	Boolean allow_auto_merge;
	Boolean delete_branch_on_merge;
	Boolean allow_update_branch;
	Boolean use_squash_pr_title_as_default;
	String squash_merge_commit_title;
	String PR_TITLE;
	String COMMIT_OR_PR_TITLE;
	String squash_merge_commit_message;
	String PR_BODY;
	String COMMIT_MESSAGES;
	String BLANK;
	String merge_commit_title;
	String MERGE_MESSAGE;
	String merge_commit_message;
	Boolean archived;
	Boolean allow_forking;
	Boolean web_commit_signoff_required;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getHomepage() {
		return homepage;
	}
	public void setHomepage(String homepage) {
		this.homepage = homepage;
	}
	public Boolean getPrivateOrPersonal() {
		return privateOrPersonal;
	}
	public void setPrivateOrPersonal(Boolean privateOrPersonal) {
		this.privateOrPersonal = privateOrPersonal;
	}
	public String getVisibility() {
		return visibility;
	}
	public void setVisibility(String visibility) {
		this.visibility = visibility;
	}
	public Object getSecurity_and_analysis() {
		return security_and_analysis;
	}
	public void setSecurity_and_analysis(Object security_and_analysis) {
		this.security_and_analysis = security_and_analysis;
	}
	public Boolean getHas_issues() {
		return has_issues;
	}
	public void setHas_issues(Boolean has_issues) {
		this.has_issues = has_issues;
	}
	public Boolean getHas_projects() {
		return has_projects;
	}
	public void setHas_projects(Boolean has_projects) {
		this.has_projects = has_projects;
	}
	public Boolean getHas_wiki() {
		return has_wiki;
	}
	public void setHas_wiki(Boolean has_wiki) {
		this.has_wiki = has_wiki;
	}
	public Boolean getIs_template() {
		return is_template;
	}
	public void setIs_template(Boolean is_template) {
		this.is_template = is_template;
	}
	public String getDefault_branch() {
		return default_branch;
	}
	public void setDefault_branch(String default_branch) {
		this.default_branch = default_branch;
	}
	public Boolean getAllow_squash_merge() {
		return allow_squash_merge;
	}
	public void setAllow_squash_merge(Boolean allow_squash_merge) {
		this.allow_squash_merge = allow_squash_merge;
	}
	public Boolean getAllow_rebase_merge() {
		return allow_rebase_merge;
	}
	public void setAllow_rebase_merge(Boolean allow_rebase_merge) {
		this.allow_rebase_merge = allow_rebase_merge;
	}
	public Boolean getAllow_auto_merge() {
		return allow_auto_merge;
	}
	public void setAllow_auto_merge(Boolean allow_auto_merge) {
		this.allow_auto_merge = allow_auto_merge;
	}
	public Boolean getDelete_branch_on_merge() {
		return delete_branch_on_merge;
	}
	public void setDelete_branch_on_merge(Boolean delete_branch_on_merge) {
		this.delete_branch_on_merge = delete_branch_on_merge;
	}
	public Boolean getAllow_update_branch() {
		return allow_update_branch;
	}
	public void setAllow_update_branch(Boolean allow_update_branch) {
		this.allow_update_branch = allow_update_branch;
	}
	public Boolean getUse_squash_pr_title_as_default() {
		return use_squash_pr_title_as_default;
	}
	public void setUse_squash_pr_title_as_default(Boolean use_squash_pr_title_as_default) {
		this.use_squash_pr_title_as_default = use_squash_pr_title_as_default;
	}
	public String getSquash_merge_commit_title() {
		return squash_merge_commit_title;
	}
	public void setSquash_merge_commit_title(String squash_merge_commit_title) {
		this.squash_merge_commit_title = squash_merge_commit_title;
	}
	public String getPR_TITLE() {
		return PR_TITLE;
	}
	public void setPR_TITLE(String pR_TITLE) {
		PR_TITLE = pR_TITLE;
	}
	public String getCOMMIT_OR_PR_TITLE() {
		return COMMIT_OR_PR_TITLE;
	}
	public void setCOMMIT_OR_PR_TITLE(String cOMMIT_OR_PR_TITLE) {
		COMMIT_OR_PR_TITLE = cOMMIT_OR_PR_TITLE;
	}
	public String getSquash_merge_commit_message() {
		return squash_merge_commit_message;
	}
	public void setSquash_merge_commit_message(String squash_merge_commit_message) {
		this.squash_merge_commit_message = squash_merge_commit_message;
	}
	public String getPR_BODY() {
		return PR_BODY;
	}
	public void setPR_BODY(String pR_BODY) {
		PR_BODY = pR_BODY;
	}
	public String getCOMMIT_MESSAGES() {
		return COMMIT_MESSAGES;
	}
	public void setCOMMIT_MESSAGES(String cOMMIT_MESSAGES) {
		COMMIT_MESSAGES = cOMMIT_MESSAGES;
	}
	public String getBLANK() {
		return BLANK;
	}
	public void setBLANK(String bLANK) {
		BLANK = bLANK;
	}
	public String getMerge_commit_title() {
		return merge_commit_title;
	}
	public void setMerge_commit_title(String merge_commit_title) {
		this.merge_commit_title = merge_commit_title;
	}
	public String getMERGE_MESSAGE() {
		return MERGE_MESSAGE;
	}
	public void setMERGE_MESSAGE(String mERGE_MESSAGE) {
		MERGE_MESSAGE = mERGE_MESSAGE;
	}
	public String getMerge_commit_message() {
		return merge_commit_message;
	}
	public void setMerge_commit_message(String merge_commit_message) {
		this.merge_commit_message = merge_commit_message;
	}
	public Boolean getArchived() {
		return archived;
	}
	public void setArchived(Boolean archived) {
		this.archived = archived;
	}
	public Boolean getAllow_forking() {
		return allow_forking;
	}
	public void setAllow_forking(Boolean allow_forking) {
		this.allow_forking = allow_forking;
	}
	public Boolean getWeb_commit_signoff_required() {
		return web_commit_signoff_required;
	}
	public void setWeb_commit_signoff_required(Boolean web_commit_signoff_required) {
		this.web_commit_signoff_required = web_commit_signoff_required;
	}*/
}
