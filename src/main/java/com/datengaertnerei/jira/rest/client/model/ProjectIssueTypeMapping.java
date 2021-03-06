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
 * The project and issue type mapping.
 */
@ApiModel(description = "The project and issue type mapping.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-05-17T17:45:56.601554Z[Etc/UTC]")
public class ProjectIssueTypeMapping {
  public static final String SERIALIZED_NAME_PROJECT_ID = "projectId";
  @SerializedName(SERIALIZED_NAME_PROJECT_ID)
  private String projectId;

  public static final String SERIALIZED_NAME_ISSUE_TYPE_ID = "issueTypeId";
  @SerializedName(SERIALIZED_NAME_ISSUE_TYPE_ID)
  private String issueTypeId;


  public ProjectIssueTypeMapping projectId(String projectId) {
    
    this.projectId = projectId;
    return this;
  }

   /**
   * The ID of the project.
   * @return projectId
  **/
  @ApiModelProperty(required = true, value = "The ID of the project.")

  public String getProjectId() {
    return projectId;
  }


  public void setProjectId(String projectId) {
    this.projectId = projectId;
  }


  public ProjectIssueTypeMapping issueTypeId(String issueTypeId) {
    
    this.issueTypeId = issueTypeId;
    return this;
  }

   /**
   * The ID of the issue type.
   * @return issueTypeId
  **/
  @ApiModelProperty(required = true, value = "The ID of the issue type.")

  public String getIssueTypeId() {
    return issueTypeId;
  }


  public void setIssueTypeId(String issueTypeId) {
    this.issueTypeId = issueTypeId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectIssueTypeMapping projectIssueTypeMapping = (ProjectIssueTypeMapping) o;
    return Objects.equals(this.projectId, projectIssueTypeMapping.projectId) &&
        Objects.equals(this.issueTypeId, projectIssueTypeMapping.issueTypeId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(projectId, issueTypeId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectIssueTypeMapping {\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    issueTypeId: ").append(toIndentedString(issueTypeId)).append("\n");
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

