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
import com.datengaertnerei.jira.rest.client.model.ApplicationRole;
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
 * SimpleListWrapperApplicationRole
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-05-17T17:45:56.601554Z[Etc/UTC]")
public class SimpleListWrapperApplicationRole {
  public static final String SERIALIZED_NAME_SIZE = "size";
  @SerializedName(SERIALIZED_NAME_SIZE)
  private Integer size;

  public static final String SERIALIZED_NAME_ITEMS = "items";
  @SerializedName(SERIALIZED_NAME_ITEMS)
  private List<ApplicationRole> items = null;

  public static final String SERIALIZED_NAME_PAGING_CALLBACK = "pagingCallback";
  @SerializedName(SERIALIZED_NAME_PAGING_CALLBACK)
  private Object pagingCallback;

  public static final String SERIALIZED_NAME_CALLBACK = "callback";
  @SerializedName(SERIALIZED_NAME_CALLBACK)
  private Object callback;

  public static final String SERIALIZED_NAME_MAX_RESULTS = "max-results";
  @SerializedName(SERIALIZED_NAME_MAX_RESULTS)
  private Integer maxResults;


  public SimpleListWrapperApplicationRole size(Integer size) {
    
    this.size = size;
    return this;
  }

   /**
   * Get size
   * @return size
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getSize() {
    return size;
  }


  public void setSize(Integer size) {
    this.size = size;
  }


  public SimpleListWrapperApplicationRole items(List<ApplicationRole> items) {
    
    this.items = items;
    return this;
  }

  public SimpleListWrapperApplicationRole addItemsItem(ApplicationRole itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * Get items
   * @return items
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<ApplicationRole> getItems() {
    return items;
  }


  public void setItems(List<ApplicationRole> items) {
    this.items = items;
  }


  public SimpleListWrapperApplicationRole pagingCallback(Object pagingCallback) {
    
    this.pagingCallback = pagingCallback;
    return this;
  }

   /**
   * Get pagingCallback
   * @return pagingCallback
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getPagingCallback() {
    return pagingCallback;
  }


  public void setPagingCallback(Object pagingCallback) {
    this.pagingCallback = pagingCallback;
  }


  public SimpleListWrapperApplicationRole callback(Object callback) {
    
    this.callback = callback;
    return this;
  }

   /**
   * Get callback
   * @return callback
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getCallback() {
    return callback;
  }


  public void setCallback(Object callback) {
    this.callback = callback;
  }


  public SimpleListWrapperApplicationRole maxResults(Integer maxResults) {
    
    this.maxResults = maxResults;
    return this;
  }

   /**
   * Get maxResults
   * @return maxResults
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getMaxResults() {
    return maxResults;
  }


  public void setMaxResults(Integer maxResults) {
    this.maxResults = maxResults;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SimpleListWrapperApplicationRole simpleListWrapperApplicationRole = (SimpleListWrapperApplicationRole) o;
    return Objects.equals(this.size, simpleListWrapperApplicationRole.size) &&
        Objects.equals(this.items, simpleListWrapperApplicationRole.items) &&
        Objects.equals(this.pagingCallback, simpleListWrapperApplicationRole.pagingCallback) &&
        Objects.equals(this.callback, simpleListWrapperApplicationRole.callback) &&
        Objects.equals(this.maxResults, simpleListWrapperApplicationRole.maxResults);
  }

  @Override
  public int hashCode() {
    return Objects.hash(size, items, pagingCallback, callback, maxResults);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SimpleListWrapperApplicationRole {\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    pagingCallback: ").append(toIndentedString(pagingCallback)).append("\n");
    sb.append("    callback: ").append(toIndentedString(callback)).append("\n");
    sb.append("    maxResults: ").append(toIndentedString(maxResults)).append("\n");
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

