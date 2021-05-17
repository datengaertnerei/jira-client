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
import com.datengaertnerei.jira.rest.client.model.FilterSubscription;
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
 * A paginated list of subscriptions to a filter.
 */
@ApiModel(description = "A paginated list of subscriptions to a filter.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-05-17T17:45:56.601554Z[Etc/UTC]")
public class FilterSubscriptionsList {
  public static final String SERIALIZED_NAME_SIZE = "size";
  @SerializedName(SERIALIZED_NAME_SIZE)
  private Integer size;

  public static final String SERIALIZED_NAME_ITEMS = "items";
  @SerializedName(SERIALIZED_NAME_ITEMS)
  private List<FilterSubscription> items = null;

  public static final String SERIALIZED_NAME_MAX_RESULTS = "max-results";
  @SerializedName(SERIALIZED_NAME_MAX_RESULTS)
  private Integer maxResults;

  public static final String SERIALIZED_NAME_START_INDEX = "start-index";
  @SerializedName(SERIALIZED_NAME_START_INDEX)
  private Integer startIndex;

  public static final String SERIALIZED_NAME_END_INDEX = "end-index";
  @SerializedName(SERIALIZED_NAME_END_INDEX)
  private Integer endIndex;


   /**
   * The number of items on the page.
   * @return size
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of items on the page.")

  public Integer getSize() {
    return size;
  }




   /**
   * The list of items.
   * @return items
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The list of items.")

  public List<FilterSubscription> getItems() {
    return items;
  }




   /**
   * The maximum number of results that could be on the page.
   * @return maxResults
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The maximum number of results that could be on the page.")

  public Integer getMaxResults() {
    return maxResults;
  }




   /**
   * The index of the first item returned on the page.
   * @return startIndex
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The index of the first item returned on the page.")

  public Integer getStartIndex() {
    return startIndex;
  }




   /**
   * The index of the last item returned on the page.
   * @return endIndex
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The index of the last item returned on the page.")

  public Integer getEndIndex() {
    return endIndex;
  }




  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FilterSubscriptionsList filterSubscriptionsList = (FilterSubscriptionsList) o;
    return Objects.equals(this.size, filterSubscriptionsList.size) &&
        Objects.equals(this.items, filterSubscriptionsList.items) &&
        Objects.equals(this.maxResults, filterSubscriptionsList.maxResults) &&
        Objects.equals(this.startIndex, filterSubscriptionsList.startIndex) &&
        Objects.equals(this.endIndex, filterSubscriptionsList.endIndex);
  }

  @Override
  public int hashCode() {
    return Objects.hash(size, items, maxResults, startIndex, endIndex);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FilterSubscriptionsList {\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    maxResults: ").append(toIndentedString(maxResults)).append("\n");
    sb.append("    startIndex: ").append(toIndentedString(startIndex)).append("\n");
    sb.append("    endIndex: ").append(toIndentedString(endIndex)).append("\n");
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

