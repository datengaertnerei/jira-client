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
 * Properties that identify a workflow.
 */
@ApiModel(description = "Properties that identify a workflow.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-05-17T17:45:56.601554Z[Etc/UTC]")
public class WorkflowId {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DRAFT = "draft";
  @SerializedName(SERIALIZED_NAME_DRAFT)
  private Boolean draft;


  public WorkflowId name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the workflow.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "The name of the workflow.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public WorkflowId draft(Boolean draft) {
    
    this.draft = draft;
    return this;
  }

   /**
   * Whether the workflow is in the draft state.
   * @return draft
  **/
  @ApiModelProperty(required = true, value = "Whether the workflow is in the draft state.")

  public Boolean getDraft() {
    return draft;
  }


  public void setDraft(Boolean draft) {
    this.draft = draft;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkflowId workflowId = (WorkflowId) o;
    return Objects.equals(this.name, workflowId.name) &&
        Objects.equals(this.draft, workflowId.draft);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, draft);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkflowId {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    draft: ").append(toIndentedString(draft)).append("\n");
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

