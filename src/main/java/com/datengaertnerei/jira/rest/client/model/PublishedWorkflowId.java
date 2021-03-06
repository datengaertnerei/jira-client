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
 * Properties that identify a published workflow.
 */
@ApiModel(description = "Properties that identify a published workflow.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-05-17T17:45:56.601554Z[Etc/UTC]")
public class PublishedWorkflowId {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_ENTITY_ID = "entityId";
  @SerializedName(SERIALIZED_NAME_ENTITY_ID)
  private String entityId;


  public PublishedWorkflowId name(String name) {
    
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


  public PublishedWorkflowId entityId(String entityId) {
    
    this.entityId = entityId;
    return this;
  }

   /**
   * The entity ID of the workflow.
   * @return entityId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The entity ID of the workflow.")

  public String getEntityId() {
    return entityId;
  }


  public void setEntityId(String entityId) {
    this.entityId = entityId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PublishedWorkflowId publishedWorkflowId = (PublishedWorkflowId) o;
    return Objects.equals(this.name, publishedWorkflowId.name) &&
        Objects.equals(this.entityId, publishedWorkflowId.entityId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, entityId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PublishedWorkflowId {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    entityId: ").append(toIndentedString(entityId)).append("\n");
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

