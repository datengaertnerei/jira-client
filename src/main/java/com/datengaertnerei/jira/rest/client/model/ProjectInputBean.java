/*
 * The Jira Cloud platform REST API
 * Jira Cloud platform REST API documentation
 *
 * The version of the OpenAPI document: 1001.0.0-SNAPSHOT
 * Contact: ecosystem@atlassian.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.datengaertnerei.jira.rest.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ProjectInputBean
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-05-17T17:45:56.601554Z[Etc/UTC]")
public class ProjectInputBean {
  public static final String SERIALIZED_NAME_KEY = "key";
  @SerializedName(SERIALIZED_NAME_KEY)
  private String key;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  /**
   * The [project type](https://confluence.atlassian.com/x/GwiiLQ#Jiraapplicationsoverview-Productfeaturesandprojecttypes), which dictates the application-specific feature set. Required when creating a project. Not applicable for the Update project resource.
   */
  @JsonAdapter(ProjectTypeKeyEnum.Adapter.class)
  public enum ProjectTypeKeyEnum {
    SOFTWARE("software"),
    
    SERVICE_DESK("service_desk"),
    
    BUSINESS("business");

    private String value;

    ProjectTypeKeyEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ProjectTypeKeyEnum fromValue(String value) {
      for (ProjectTypeKeyEnum b : ProjectTypeKeyEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ProjectTypeKeyEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ProjectTypeKeyEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ProjectTypeKeyEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ProjectTypeKeyEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_PROJECT_TYPE_KEY = "projectTypeKey";
  @SerializedName(SERIALIZED_NAME_PROJECT_TYPE_KEY)
  private ProjectTypeKeyEnum projectTypeKey;

  /**
   * A prebuilt configuration for a project. The type of the &#x60;projectTemplateKey&#x60; must match with the type of the &#x60;projectTypeKey&#x60;. Required when creating a project. Not applicable for the Update project resource.
   */
  @JsonAdapter(ProjectTemplateKeyEnum.Adapter.class)
  public enum ProjectTemplateKeyEnum {
    PYXIS_GREENHOPPER_JIRA_GH_SIMPLIFIED_AGILITY_KANBAN("com.pyxis.greenhopper.jira:gh-simplified-agility-kanban"),
    
    PYXIS_GREENHOPPER_JIRA_GH_SIMPLIFIED_AGILITY_SCRUM("com.pyxis.greenhopper.jira:gh-simplified-agility-scrum"),
    
    PYXIS_GREENHOPPER_JIRA_GH_SIMPLIFIED_BASIC("com.pyxis.greenhopper.jira:gh-simplified-basic"),
    
    PYXIS_GREENHOPPER_JIRA_GH_SIMPLIFIED_KANBAN_CLASSIC("com.pyxis.greenhopper.jira:gh-simplified-kanban-classic"),
    
    PYXIS_GREENHOPPER_JIRA_GH_SIMPLIFIED_SCRUM_CLASSIC("com.pyxis.greenhopper.jira:gh-simplified-scrum-classic"),
    
    ATLASSIAN_SERVICEDESK_SIMPLIFIED_IT_SERVICE_DESK("com.atlassian.servicedesk:simplified-it-service-desk"),
    
    ATLASSIAN_SERVICEDESK_SIMPLIFIED_INTERNAL_SERVICE_DESK("com.atlassian.servicedesk:simplified-internal-service-desk"),
    
    ATLASSIAN_SERVICEDESK_SIMPLIFIED_EXTERNAL_SERVICE_DESK("com.atlassian.servicedesk:simplified-external-service-desk"),
    
    ATLASSIAN_SERVICEDESK_SIMPLIFIED_HR_SERVICE_DESK("com.atlassian.servicedesk:simplified-hr-service-desk"),
    
    ATLASSIAN_SERVICEDESK_SIMPLIFIED_FACILITIES_SERVICE_DESK("com.atlassian.servicedesk:simplified-facilities-service-desk"),
    
    ATLASSIAN_JIRA_CORE_PROJECT_TEMPLATES_JIRA_CORE_SIMPLIFIED_CONTENT_MANAGEMENT("com.atlassian.jira-core-project-templates:jira-core-simplified-content-management"),
    
    ATLASSIAN_JIRA_CORE_PROJECT_TEMPLATES_JIRA_CORE_SIMPLIFIED_DOCUMENT_APPROVAL("com.atlassian.jira-core-project-templates:jira-core-simplified-document-approval"),
    
    ATLASSIAN_JIRA_CORE_PROJECT_TEMPLATES_JIRA_CORE_SIMPLIFIED_LEAD_TRACKING("com.atlassian.jira-core-project-templates:jira-core-simplified-lead-tracking"),
    
    ATLASSIAN_JIRA_CORE_PROJECT_TEMPLATES_JIRA_CORE_SIMPLIFIED_PROCESS_CONTROL("com.atlassian.jira-core-project-templates:jira-core-simplified-process-control"),
    
    ATLASSIAN_JIRA_CORE_PROJECT_TEMPLATES_JIRA_CORE_SIMPLIFIED_PROCUREMENT("com.atlassian.jira-core-project-templates:jira-core-simplified-procurement"),
    
    ATLASSIAN_JIRA_CORE_PROJECT_TEMPLATES_JIRA_CORE_SIMPLIFIED_PROJECT_MANAGEMENT("com.atlassian.jira-core-project-templates:jira-core-simplified-project-management"),
    
    ATLASSIAN_JIRA_CORE_PROJECT_TEMPLATES_JIRA_CORE_SIMPLIFIED_RECRUITMENT("com.atlassian.jira-core-project-templates:jira-core-simplified-recruitment"),
    
    ATLASSIAN_JIRA_CORE_PROJECT_TEMPLATES_JIRA_CORE_SIMPLIFIED_TASK_("com.atlassian.jira-core-project-templates:jira-core-simplified-task-");

    private String value;

    ProjectTemplateKeyEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ProjectTemplateKeyEnum fromValue(String value) {
      for (ProjectTemplateKeyEnum b : ProjectTemplateKeyEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ProjectTemplateKeyEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ProjectTemplateKeyEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ProjectTemplateKeyEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ProjectTemplateKeyEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_PROJECT_TEMPLATE_KEY = "projectTemplateKey";
  @SerializedName(SERIALIZED_NAME_PROJECT_TEMPLATE_KEY)
  private ProjectTemplateKeyEnum projectTemplateKey;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_LEAD = "lead";
  @SerializedName(SERIALIZED_NAME_LEAD)
  private String lead;

  public static final String SERIALIZED_NAME_LEAD_ACCOUNT_ID = "leadAccountId";
  @SerializedName(SERIALIZED_NAME_LEAD_ACCOUNT_ID)
  private String leadAccountId;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  /**
   * The default assignee when creating issues for this project.
   */
  @JsonAdapter(AssigneeTypeEnum.Adapter.class)
  public enum AssigneeTypeEnum {
    PROJECT_LEAD("PROJECT_LEAD"),
    
    UNASSIGNED("UNASSIGNED");

    private String value;

    AssigneeTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AssigneeTypeEnum fromValue(String value) {
      for (AssigneeTypeEnum b : AssigneeTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<AssigneeTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AssigneeTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AssigneeTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return AssigneeTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_ASSIGNEE_TYPE = "assigneeType";
  @SerializedName(SERIALIZED_NAME_ASSIGNEE_TYPE)
  private AssigneeTypeEnum assigneeType;

  public static final String SERIALIZED_NAME_AVATAR_ID = "avatarId";
  @SerializedName(SERIALIZED_NAME_AVATAR_ID)
  private Long avatarId;

  public static final String SERIALIZED_NAME_ISSUE_SECURITY_SCHEME = "issueSecurityScheme";
  @SerializedName(SERIALIZED_NAME_ISSUE_SECURITY_SCHEME)
  private Long issueSecurityScheme;

  public static final String SERIALIZED_NAME_PERMISSION_SCHEME = "permissionScheme";
  @SerializedName(SERIALIZED_NAME_PERMISSION_SCHEME)
  private Long permissionScheme;

  public static final String SERIALIZED_NAME_NOTIFICATION_SCHEME = "notificationScheme";
  @SerializedName(SERIALIZED_NAME_NOTIFICATION_SCHEME)
  private Long notificationScheme;

  public static final String SERIALIZED_NAME_CATEGORY_ID = "categoryId";
  @SerializedName(SERIALIZED_NAME_CATEGORY_ID)
  private Long categoryId;


  public ProjectInputBean key(String key) {
    
    this.key = key;
    return this;
  }

   /**
   * Project keys must be unique and start with an uppercase letter followed by one or more uppercase alphanumeric characters. The maximum length is 10 characters. Required when creating a project. Optional when updating a project.
   * @return key
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Project keys must be unique and start with an uppercase letter followed by one or more uppercase alphanumeric characters. The maximum length is 10 characters. Required when creating a project. Optional when updating a project.")

  public String getKey() {
    return key;
  }


  public void setKey(String key) {
    this.key = key;
  }


  public ProjectInputBean name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the project. Required when creating a project. Optional when updating a project.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the project. Required when creating a project. Optional when updating a project.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public ProjectInputBean projectTypeKey(ProjectTypeKeyEnum projectTypeKey) {
    
    this.projectTypeKey = projectTypeKey;
    return this;
  }

   /**
   * The [project type](https://confluence.atlassian.com/x/GwiiLQ#Jiraapplicationsoverview-Productfeaturesandprojecttypes), which dictates the application-specific feature set. Required when creating a project. Not applicable for the Update project resource.
   * @return projectTypeKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The [project type](https://confluence.atlassian.com/x/GwiiLQ#Jiraapplicationsoverview-Productfeaturesandprojecttypes), which dictates the application-specific feature set. Required when creating a project. Not applicable for the Update project resource.")

  public ProjectTypeKeyEnum getProjectTypeKey() {
    return projectTypeKey;
  }


  public void setProjectTypeKey(ProjectTypeKeyEnum projectTypeKey) {
    this.projectTypeKey = projectTypeKey;
  }


  public ProjectInputBean projectTemplateKey(ProjectTemplateKeyEnum projectTemplateKey) {
    
    this.projectTemplateKey = projectTemplateKey;
    return this;
  }

   /**
   * A prebuilt configuration for a project. The type of the &#x60;projectTemplateKey&#x60; must match with the type of the &#x60;projectTypeKey&#x60;. Required when creating a project. Not applicable for the Update project resource.
   * @return projectTemplateKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A prebuilt configuration for a project. The type of the `projectTemplateKey` must match with the type of the `projectTypeKey`. Required when creating a project. Not applicable for the Update project resource.")

  public ProjectTemplateKeyEnum getProjectTemplateKey() {
    return projectTemplateKey;
  }


  public void setProjectTemplateKey(ProjectTemplateKeyEnum projectTemplateKey) {
    this.projectTemplateKey = projectTemplateKey;
  }


  public ProjectInputBean description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * A brief description of the project.
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A brief description of the project.")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public ProjectInputBean lead(String lead) {
    
    this.lead = lead;
    return this;
  }

   /**
   * This parameter is deprecated because of privacy changes. Use &#x60;leadAccountId&#x60; instead. See the [migration guide](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details. The user name of the project lead. Either &#x60;lead&#x60; or &#x60;leadAccountId&#x60; must be set when creating a project. Optional when updating a project. Cannot be provided with &#x60;leadAccountId&#x60;.
   * @return lead
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "This parameter is deprecated because of privacy changes. Use `leadAccountId` instead. See the [migration guide](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details. The user name of the project lead. Either `lead` or `leadAccountId` must be set when creating a project. Optional when updating a project. Cannot be provided with `leadAccountId`.")

  public String getLead() {
    return lead;
  }


  public void setLead(String lead) {
    this.lead = lead;
  }


  public ProjectInputBean leadAccountId(String leadAccountId) {
    
    this.leadAccountId = leadAccountId;
    return this;
  }

   /**
   * The account ID of the project lead. Either &#x60;lead&#x60; or &#x60;leadAccountId&#x60; must be set when creating a project. Optional when updating a project. Cannot be provided with &#x60;lead&#x60;.
   * @return leadAccountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The account ID of the project lead. Either `lead` or `leadAccountId` must be set when creating a project. Optional when updating a project. Cannot be provided with `lead`.")

  public String getLeadAccountId() {
    return leadAccountId;
  }


  public void setLeadAccountId(String leadAccountId) {
    this.leadAccountId = leadAccountId;
  }


  public ProjectInputBean url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * A link to information about this project, such as project documentation
   * @return url
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A link to information about this project, such as project documentation")

  public String getUrl() {
    return url;
  }


  public void setUrl(String url) {
    this.url = url;
  }


  public ProjectInputBean assigneeType(AssigneeTypeEnum assigneeType) {
    
    this.assigneeType = assigneeType;
    return this;
  }

   /**
   * The default assignee when creating issues for this project.
   * @return assigneeType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The default assignee when creating issues for this project.")

  public AssigneeTypeEnum getAssigneeType() {
    return assigneeType;
  }


  public void setAssigneeType(AssigneeTypeEnum assigneeType) {
    this.assigneeType = assigneeType;
  }


  public ProjectInputBean avatarId(Long avatarId) {
    
    this.avatarId = avatarId;
    return this;
  }

   /**
   * An integer value for the project&#39;s avatar.
   * @return avatarId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An integer value for the project's avatar.")

  public Long getAvatarId() {
    return avatarId;
  }


  public void setAvatarId(Long avatarId) {
    this.avatarId = avatarId;
  }


  public ProjectInputBean issueSecurityScheme(Long issueSecurityScheme) {
    
    this.issueSecurityScheme = issueSecurityScheme;
    return this;
  }

   /**
   * The ID of the issue security scheme for the project, which enables you to control who can and cannot view issues. Use the [Get issue security schemes](#api-rest-api-3-issuesecurityschemes-get) resource to get all issue security scheme IDs.
   * @return issueSecurityScheme
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the issue security scheme for the project, which enables you to control who can and cannot view issues. Use the [Get issue security schemes](#api-rest-api-3-issuesecurityschemes-get) resource to get all issue security scheme IDs.")

  public Long getIssueSecurityScheme() {
    return issueSecurityScheme;
  }


  public void setIssueSecurityScheme(Long issueSecurityScheme) {
    this.issueSecurityScheme = issueSecurityScheme;
  }


  public ProjectInputBean permissionScheme(Long permissionScheme) {
    
    this.permissionScheme = permissionScheme;
    return this;
  }

   /**
   * The ID of the permission scheme for the project. Use the [Get all permission schemes](#api-rest-api-3-permissionscheme-get) resource to see a list of all permission scheme IDs.
   * @return permissionScheme
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the permission scheme for the project. Use the [Get all permission schemes](#api-rest-api-3-permissionscheme-get) resource to see a list of all permission scheme IDs.")

  public Long getPermissionScheme() {
    return permissionScheme;
  }


  public void setPermissionScheme(Long permissionScheme) {
    this.permissionScheme = permissionScheme;
  }


  public ProjectInputBean notificationScheme(Long notificationScheme) {
    
    this.notificationScheme = notificationScheme;
    return this;
  }

   /**
   * The ID of the notification scheme for the project. Use the [Get notification schemes](#api-rest-api-3-notificationscheme-get) resource to get a list of notification scheme IDs.
   * @return notificationScheme
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the notification scheme for the project. Use the [Get notification schemes](#api-rest-api-3-notificationscheme-get) resource to get a list of notification scheme IDs.")

  public Long getNotificationScheme() {
    return notificationScheme;
  }


  public void setNotificationScheme(Long notificationScheme) {
    this.notificationScheme = notificationScheme;
  }


  public ProjectInputBean categoryId(Long categoryId) {
    
    this.categoryId = categoryId;
    return this;
  }

   /**
   * The ID of the project&#39;s category. A complete list of category IDs is found using the [Get all project categories](#api-rest-api-3-projectCategory-get) operation.
   * @return categoryId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the project's category. A complete list of category IDs is found using the [Get all project categories](#api-rest-api-3-projectCategory-get) operation.")

  public Long getCategoryId() {
    return categoryId;
  }


  public void setCategoryId(Long categoryId) {
    this.categoryId = categoryId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectInputBean projectInputBean = (ProjectInputBean) o;
    return Objects.equals(this.key, projectInputBean.key) &&
        Objects.equals(this.name, projectInputBean.name) &&
        Objects.equals(this.projectTypeKey, projectInputBean.projectTypeKey) &&
        Objects.equals(this.projectTemplateKey, projectInputBean.projectTemplateKey) &&
        Objects.equals(this.description, projectInputBean.description) &&
        Objects.equals(this.lead, projectInputBean.lead) &&
        Objects.equals(this.leadAccountId, projectInputBean.leadAccountId) &&
        Objects.equals(this.url, projectInputBean.url) &&
        Objects.equals(this.assigneeType, projectInputBean.assigneeType) &&
        Objects.equals(this.avatarId, projectInputBean.avatarId) &&
        Objects.equals(this.issueSecurityScheme, projectInputBean.issueSecurityScheme) &&
        Objects.equals(this.permissionScheme, projectInputBean.permissionScheme) &&
        Objects.equals(this.notificationScheme, projectInputBean.notificationScheme) &&
        Objects.equals(this.categoryId, projectInputBean.categoryId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, name, projectTypeKey, projectTemplateKey, description, lead, leadAccountId, url, assigneeType, avatarId, issueSecurityScheme, permissionScheme, notificationScheme, categoryId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectInputBean {\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    projectTypeKey: ").append(toIndentedString(projectTypeKey)).append("\n");
    sb.append("    projectTemplateKey: ").append(toIndentedString(projectTemplateKey)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    lead: ").append(toIndentedString(lead)).append("\n");
    sb.append("    leadAccountId: ").append(toIndentedString(leadAccountId)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    assigneeType: ").append(toIndentedString(assigneeType)).append("\n");
    sb.append("    avatarId: ").append(toIndentedString(avatarId)).append("\n");
    sb.append("    issueSecurityScheme: ").append(toIndentedString(issueSecurityScheme)).append("\n");
    sb.append("    permissionScheme: ").append(toIndentedString(permissionScheme)).append("\n");
    sb.append("    notificationScheme: ").append(toIndentedString(notificationScheme)).append("\n");
    sb.append("    categoryId: ").append(toIndentedString(categoryId)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

