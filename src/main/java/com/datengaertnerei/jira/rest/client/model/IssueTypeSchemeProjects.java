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
import com.datengaertnerei.jira.rest.client.model.IssueTypeScheme;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Issue type scheme with a list of the projects that use it.
 */
@ApiModel(description = "Issue type scheme with a list of the projects that use it.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-05-17T17:45:56.601554Z[Etc/UTC]")
public class IssueTypeSchemeProjects {
  public static final String SERIALIZED_NAME_ISSUE_TYPE_SCHEME = "issueTypeScheme";
  @SerializedName(SERIALIZED_NAME_ISSUE_TYPE_SCHEME)
  private IssueTypeScheme issueTypeScheme;

  public static final String SERIALIZED_NAME_PROJECT_IDS = "projectIds";
  @SerializedName(SERIALIZED_NAME_PROJECT_IDS)
  private List<String> projectIds = new ArrayList<>();


  public IssueTypeSchemeProjects issueTypeScheme(IssueTypeScheme issueTypeScheme) {
    
    this.issueTypeScheme = issueTypeScheme;
    return this;
  }

   /**
   * Details of an issue type scheme.
   * @return issueTypeScheme
  **/
  @ApiModelProperty(required = true, value = "Details of an issue type scheme.")

  public IssueTypeScheme getIssueTypeScheme() {
    return issueTypeScheme;
  }


  public void setIssueTypeScheme(IssueTypeScheme issueTypeScheme) {
    this.issueTypeScheme = issueTypeScheme;
  }


  public IssueTypeSchemeProjects projectIds(List<String> projectIds) {
    
    this.projectIds = projectIds;
    return this;
  }

  public IssueTypeSchemeProjects addProjectIdsItem(String projectIdsItem) {
    this.projectIds.add(projectIdsItem);
    return this;
  }

   /**
   * The IDs of the projects using the issue type scheme.
   * @return projectIds
  **/
  @ApiModelProperty(required = true, value = "The IDs of the projects using the issue type scheme.")

  public List<String> getProjectIds() {
    return projectIds;
  }


  public void setProjectIds(List<String> projectIds) {
    this.projectIds = projectIds;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IssueTypeSchemeProjects issueTypeSchemeProjects = (IssueTypeSchemeProjects) o;
    return Objects.equals(this.issueTypeScheme, issueTypeSchemeProjects.issueTypeScheme) &&
        Objects.equals(this.projectIds, issueTypeSchemeProjects.projectIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(issueTypeScheme, projectIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IssueTypeSchemeProjects {\n");
    sb.append("    issueTypeScheme: ").append(toIndentedString(issueTypeScheme)).append("\n");
    sb.append("    projectIds: ").append(toIndentedString(projectIds)).append("\n");
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

