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
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/**
 * Bulk operation filter details.
 */
@ApiModel(description = "Bulk operation filter details.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-05-17T17:45:56.601554Z[Etc/UTC]")
public class IssueFilterForBulkPropertyDelete {
  public static final String SERIALIZED_NAME_ENTITY_IDS = "entityIds";
  @SerializedName(SERIALIZED_NAME_ENTITY_IDS)
  private Set<Long> entityIds = null;

  public static final String SERIALIZED_NAME_CURRENT_VALUE = "currentValue";
  @SerializedName(SERIALIZED_NAME_CURRENT_VALUE)
  private Object currentValue = null;


  public IssueFilterForBulkPropertyDelete entityIds(Set<Long> entityIds) {
    
    this.entityIds = entityIds;
    return this;
  }

  public IssueFilterForBulkPropertyDelete addEntityIdsItem(Long entityIdsItem) {
    if (this.entityIds == null) {
      this.entityIds = new LinkedHashSet<>();
    }
    this.entityIds.add(entityIdsItem);
    return this;
  }

   /**
   * List of issues to perform the bulk delete operation on.
   * @return entityIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of issues to perform the bulk delete operation on.")

  public Set<Long> getEntityIds() {
    return entityIds;
  }


  public void setEntityIds(Set<Long> entityIds) {
    this.entityIds = entityIds;
  }


  public IssueFilterForBulkPropertyDelete currentValue(Object currentValue) {
    
    this.currentValue = currentValue;
    return this;
  }

   /**
   * The value of properties to perform the bulk operation on.
   * @return currentValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The value of properties to perform the bulk operation on.")

  public Object getCurrentValue() {
    return currentValue;
  }


  public void setCurrentValue(Object currentValue) {
    this.currentValue = currentValue;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IssueFilterForBulkPropertyDelete issueFilterForBulkPropertyDelete = (IssueFilterForBulkPropertyDelete) o;
    return Objects.equals(this.entityIds, issueFilterForBulkPropertyDelete.entityIds) &&
        Objects.equals(this.currentValue, issueFilterForBulkPropertyDelete.currentValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entityIds, currentValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IssueFilterForBulkPropertyDelete {\n");
    sb.append("    entityIds: ").append(toIndentedString(entityIds)).append("\n");
    sb.append("    currentValue: ").append(toIndentedString(currentValue)).append("\n");
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

