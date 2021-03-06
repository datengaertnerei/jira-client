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
import com.datengaertnerei.jira.rest.client.model.BulkOperationErrorResult;
import com.datengaertnerei.jira.rest.client.model.CreatedIssue;
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
 * Details about the issues created and the errors for requests that failed.
 */
@ApiModel(description = "Details about the issues created and the errors for requests that failed.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-05-17T17:45:56.601554Z[Etc/UTC]")
public class CreatedIssues {
  public static final String SERIALIZED_NAME_ISSUES = "issues";
  @SerializedName(SERIALIZED_NAME_ISSUES)
  private List<CreatedIssue> issues = null;

  public static final String SERIALIZED_NAME_ERRORS = "errors";
  @SerializedName(SERIALIZED_NAME_ERRORS)
  private List<BulkOperationErrorResult> errors = null;


   /**
   * Details of the issues created.
   * @return issues
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Details of the issues created.")

  public List<CreatedIssue> getIssues() {
    return issues;
  }




   /**
   * Error details for failed issue creation requests.
   * @return errors
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Error details for failed issue creation requests.")

  public List<BulkOperationErrorResult> getErrors() {
    return errors;
  }




  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreatedIssues createdIssues = (CreatedIssues) o;
    return Objects.equals(this.issues, createdIssues.issues) &&
        Objects.equals(this.errors, createdIssues.errors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(issues, errors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreatedIssues {\n");
    sb.append("    issues: ").append(toIndentedString(issues)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
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

