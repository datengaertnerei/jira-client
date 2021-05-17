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
 * Details of the name, description, and default issue type for an issue type scheme.
 */
@ApiModel(description = "Details of the name, description, and default issue type for an issue type scheme.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-05-17T17:45:56.601554Z[Etc/UTC]")
public class IssueTypeSchemeUpdateDetails {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_DEFAULT_ISSUE_TYPE_ID = "defaultIssueTypeId";
  @SerializedName(SERIALIZED_NAME_DEFAULT_ISSUE_TYPE_ID)
  private String defaultIssueTypeId;


  public IssueTypeSchemeUpdateDetails name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the issue type scheme. The name must be unique. The maximum length is 255 characters.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the issue type scheme. The name must be unique. The maximum length is 255 characters.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public IssueTypeSchemeUpdateDetails description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * The description of the issue type scheme. The maximum length is 4000 characters.
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The description of the issue type scheme. The maximum length is 4000 characters.")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public IssueTypeSchemeUpdateDetails defaultIssueTypeId(String defaultIssueTypeId) {
    
    this.defaultIssueTypeId = defaultIssueTypeId;
    return this;
  }

   /**
   * The ID of the default issue type of the issue type scheme.
   * @return defaultIssueTypeId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the default issue type of the issue type scheme.")

  public String getDefaultIssueTypeId() {
    return defaultIssueTypeId;
  }


  public void setDefaultIssueTypeId(String defaultIssueTypeId) {
    this.defaultIssueTypeId = defaultIssueTypeId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IssueTypeSchemeUpdateDetails issueTypeSchemeUpdateDetails = (IssueTypeSchemeUpdateDetails) o;
    return Objects.equals(this.name, issueTypeSchemeUpdateDetails.name) &&
        Objects.equals(this.description, issueTypeSchemeUpdateDetails.description) &&
        Objects.equals(this.defaultIssueTypeId, issueTypeSchemeUpdateDetails.defaultIssueTypeId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, defaultIssueTypeId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IssueTypeSchemeUpdateDetails {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    defaultIssueTypeId: ").append(toIndentedString(defaultIssueTypeId)).append("\n");
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

