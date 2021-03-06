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
 * The screen scheme for an issue type.
 */
@ApiModel(description = "The screen scheme for an issue type.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-05-17T17:45:56.601554Z[Etc/UTC]")
public class IssueTypeScreenSchemeItem {
  public static final String SERIALIZED_NAME_ISSUE_TYPE_SCREEN_SCHEME_ID = "issueTypeScreenSchemeId";
  @SerializedName(SERIALIZED_NAME_ISSUE_TYPE_SCREEN_SCHEME_ID)
  private String issueTypeScreenSchemeId;

  public static final String SERIALIZED_NAME_ISSUE_TYPE_ID = "issueTypeId";
  @SerializedName(SERIALIZED_NAME_ISSUE_TYPE_ID)
  private String issueTypeId;

  public static final String SERIALIZED_NAME_SCREEN_SCHEME_ID = "screenSchemeId";
  @SerializedName(SERIALIZED_NAME_SCREEN_SCHEME_ID)
  private String screenSchemeId;


  public IssueTypeScreenSchemeItem issueTypeScreenSchemeId(String issueTypeScreenSchemeId) {
    
    this.issueTypeScreenSchemeId = issueTypeScreenSchemeId;
    return this;
  }

   /**
   * The ID of the issue type screen scheme.
   * @return issueTypeScreenSchemeId
  **/
  @ApiModelProperty(required = true, value = "The ID of the issue type screen scheme.")

  public String getIssueTypeScreenSchemeId() {
    return issueTypeScreenSchemeId;
  }


  public void setIssueTypeScreenSchemeId(String issueTypeScreenSchemeId) {
    this.issueTypeScreenSchemeId = issueTypeScreenSchemeId;
  }


  public IssueTypeScreenSchemeItem issueTypeId(String issueTypeId) {
    
    this.issueTypeId = issueTypeId;
    return this;
  }

   /**
   * The ID of the issue type or *default*. Only issue types used in classic projects are accepted. When creating an issue screen scheme, an entry for *default* must be provided and defines the mapping for all issue types without a screen scheme. Otherwise, a *default* entry can&#39;t be provided.
   * @return issueTypeId
  **/
  @ApiModelProperty(required = true, value = "The ID of the issue type or *default*. Only issue types used in classic projects are accepted. When creating an issue screen scheme, an entry for *default* must be provided and defines the mapping for all issue types without a screen scheme. Otherwise, a *default* entry can't be provided.")

  public String getIssueTypeId() {
    return issueTypeId;
  }


  public void setIssueTypeId(String issueTypeId) {
    this.issueTypeId = issueTypeId;
  }


  public IssueTypeScreenSchemeItem screenSchemeId(String screenSchemeId) {
    
    this.screenSchemeId = screenSchemeId;
    return this;
  }

   /**
   * The ID of the screen scheme.
   * @return screenSchemeId
  **/
  @ApiModelProperty(required = true, value = "The ID of the screen scheme.")

  public String getScreenSchemeId() {
    return screenSchemeId;
  }


  public void setScreenSchemeId(String screenSchemeId) {
    this.screenSchemeId = screenSchemeId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IssueTypeScreenSchemeItem issueTypeScreenSchemeItem = (IssueTypeScreenSchemeItem) o;
    return Objects.equals(this.issueTypeScreenSchemeId, issueTypeScreenSchemeItem.issueTypeScreenSchemeId) &&
        Objects.equals(this.issueTypeId, issueTypeScreenSchemeItem.issueTypeId) &&
        Objects.equals(this.screenSchemeId, issueTypeScreenSchemeItem.screenSchemeId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(issueTypeScreenSchemeId, issueTypeId, screenSchemeId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IssueTypeScreenSchemeItem {\n");
    sb.append("    issueTypeScreenSchemeId: ").append(toIndentedString(issueTypeScreenSchemeId)).append("\n");
    sb.append("    issueTypeId: ").append(toIndentedString(issueTypeId)).append("\n");
    sb.append("    screenSchemeId: ").append(toIndentedString(screenSchemeId)).append("\n");
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

