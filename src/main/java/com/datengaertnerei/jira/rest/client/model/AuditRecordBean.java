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
import com.datengaertnerei.jira.rest.client.model.AssociatedItemBean;
import com.datengaertnerei.jira.rest.client.model.ChangedValueBean;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * An audit record.
 */
@ApiModel(description = "An audit record.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-05-17T17:45:56.601554Z[Etc/UTC]")
public class AuditRecordBean {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id;

  public static final String SERIALIZED_NAME_SUMMARY = "summary";
  @SerializedName(SERIALIZED_NAME_SUMMARY)
  private String summary;

  public static final String SERIALIZED_NAME_REMOTE_ADDRESS = "remoteAddress";
  @SerializedName(SERIALIZED_NAME_REMOTE_ADDRESS)
  private String remoteAddress;

  public static final String SERIALIZED_NAME_AUTHOR_KEY = "authorKey";
  @SerializedName(SERIALIZED_NAME_AUTHOR_KEY)
  private String authorKey;

  public static final String SERIALIZED_NAME_CREATED = "created";
  @SerializedName(SERIALIZED_NAME_CREATED)
  private OffsetDateTime created;

  public static final String SERIALIZED_NAME_CATEGORY = "category";
  @SerializedName(SERIALIZED_NAME_CATEGORY)
  private String category;

  public static final String SERIALIZED_NAME_EVENT_SOURCE = "eventSource";
  @SerializedName(SERIALIZED_NAME_EVENT_SOURCE)
  private String eventSource;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_OBJECT_ITEM = "objectItem";
  @SerializedName(SERIALIZED_NAME_OBJECT_ITEM)
  private AssociatedItemBean objectItem;

  public static final String SERIALIZED_NAME_CHANGED_VALUES = "changedValues";
  @SerializedName(SERIALIZED_NAME_CHANGED_VALUES)
  private List<ChangedValueBean> changedValues = null;

  public static final String SERIALIZED_NAME_ASSOCIATED_ITEMS = "associatedItems";
  @SerializedName(SERIALIZED_NAME_ASSOCIATED_ITEMS)
  private List<AssociatedItemBean> associatedItems = null;


   /**
   * The ID of the audit record.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the audit record.")

  public Long getId() {
    return id;
  }




   /**
   * The summary of the audit record.
   * @return summary
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The summary of the audit record.")

  public String getSummary() {
    return summary;
  }




   /**
   * The URL of the computer where the creation of the audit record was initiated.
   * @return remoteAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The URL of the computer where the creation of the audit record was initiated.")

  public String getRemoteAddress() {
    return remoteAddress;
  }




   /**
   * Deprecated, use &#x60;authorAccountId&#x60; instead. The key of the user who created the audit record.
   * @return authorKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Deprecated, use `authorAccountId` instead. The key of the user who created the audit record.")

  public String getAuthorKey() {
    return authorKey;
  }




   /**
   * The date and time on which the audit record was created.
   * @return created
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The date and time on which the audit record was created.")

  public OffsetDateTime getCreated() {
    return created;
  }




   /**
   * The category of the audit record. For a list of these categories, see the help article [Auditing in Jira applications](https://confluence.atlassian.com/x/noXKM).
   * @return category
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The category of the audit record. For a list of these categories, see the help article [Auditing in Jira applications](https://confluence.atlassian.com/x/noXKM).")

  public String getCategory() {
    return category;
  }




   /**
   * The event the audit record originated from.
   * @return eventSource
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The event the audit record originated from.")

  public String getEventSource() {
    return eventSource;
  }




   /**
   * The description of the audit record.
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The description of the audit record.")

  public String getDescription() {
    return description;
  }




  public AuditRecordBean objectItem(AssociatedItemBean objectItem) {
    
    this.objectItem = objectItem;
    return this;
  }

   /**
   * Get objectItem
   * @return objectItem
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AssociatedItemBean getObjectItem() {
    return objectItem;
  }


  public void setObjectItem(AssociatedItemBean objectItem) {
    this.objectItem = objectItem;
  }


   /**
   * The list of values changed in the record event.
   * @return changedValues
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The list of values changed in the record event.")

  public List<ChangedValueBean> getChangedValues() {
    return changedValues;
  }




   /**
   * The list of items associated with the changed record.
   * @return associatedItems
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The list of items associated with the changed record.")

  public List<AssociatedItemBean> getAssociatedItems() {
    return associatedItems;
  }




  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuditRecordBean auditRecordBean = (AuditRecordBean) o;
    return Objects.equals(this.id, auditRecordBean.id) &&
        Objects.equals(this.summary, auditRecordBean.summary) &&
        Objects.equals(this.remoteAddress, auditRecordBean.remoteAddress) &&
        Objects.equals(this.authorKey, auditRecordBean.authorKey) &&
        Objects.equals(this.created, auditRecordBean.created) &&
        Objects.equals(this.category, auditRecordBean.category) &&
        Objects.equals(this.eventSource, auditRecordBean.eventSource) &&
        Objects.equals(this.description, auditRecordBean.description) &&
        Objects.equals(this.objectItem, auditRecordBean.objectItem) &&
        Objects.equals(this.changedValues, auditRecordBean.changedValues) &&
        Objects.equals(this.associatedItems, auditRecordBean.associatedItems);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, summary, remoteAddress, authorKey, created, category, eventSource, description, objectItem, changedValues, associatedItems);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuditRecordBean {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
    sb.append("    remoteAddress: ").append(toIndentedString(remoteAddress)).append("\n");
    sb.append("    authorKey: ").append(toIndentedString(authorKey)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    eventSource: ").append(toIndentedString(eventSource)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    objectItem: ").append(toIndentedString(objectItem)).append("\n");
    sb.append("    changedValues: ").append(toIndentedString(changedValues)).append("\n");
    sb.append("    associatedItems: ").append(toIndentedString(associatedItems)).append("\n");
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

