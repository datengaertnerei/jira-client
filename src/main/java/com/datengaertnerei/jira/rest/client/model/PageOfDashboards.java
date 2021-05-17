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
import com.datengaertnerei.jira.rest.client.model.Dashboard;
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
 * A page containing dashboard details.
 */
@ApiModel(description = "A page containing dashboard details.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-05-17T17:45:56.601554Z[Etc/UTC]")
public class PageOfDashboards {
  public static final String SERIALIZED_NAME_START_AT = "startAt";
  @SerializedName(SERIALIZED_NAME_START_AT)
  private Integer startAt;

  public static final String SERIALIZED_NAME_MAX_RESULTS = "maxResults";
  @SerializedName(SERIALIZED_NAME_MAX_RESULTS)
  private Integer maxResults;

  public static final String SERIALIZED_NAME_TOTAL = "total";
  @SerializedName(SERIALIZED_NAME_TOTAL)
  private Integer total;

  public static final String SERIALIZED_NAME_PREV = "prev";
  @SerializedName(SERIALIZED_NAME_PREV)
  private String prev;

  public static final String SERIALIZED_NAME_NEXT = "next";
  @SerializedName(SERIALIZED_NAME_NEXT)
  private String next;

  public static final String SERIALIZED_NAME_DASHBOARDS = "dashboards";
  @SerializedName(SERIALIZED_NAME_DASHBOARDS)
  private List<Dashboard> dashboards = null;


   /**
   * The index of the first item returned on the page.
   * @return startAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The index of the first item returned on the page.")

  public Integer getStartAt() {
    return startAt;
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
   * The number of results on the page.
   * @return total
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of results on the page.")

  public Integer getTotal() {
    return total;
  }




   /**
   * The URL of the previous page of results, if any.
   * @return prev
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The URL of the previous page of results, if any.")

  public String getPrev() {
    return prev;
  }




   /**
   * The URL of the next page of results, if any.
   * @return next
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The URL of the next page of results, if any.")

  public String getNext() {
    return next;
  }




   /**
   * List of dashboards.
   * @return dashboards
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of dashboards.")

  public List<Dashboard> getDashboards() {
    return dashboards;
  }




  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PageOfDashboards pageOfDashboards = (PageOfDashboards) o;
    return Objects.equals(this.startAt, pageOfDashboards.startAt) &&
        Objects.equals(this.maxResults, pageOfDashboards.maxResults) &&
        Objects.equals(this.total, pageOfDashboards.total) &&
        Objects.equals(this.prev, pageOfDashboards.prev) &&
        Objects.equals(this.next, pageOfDashboards.next) &&
        Objects.equals(this.dashboards, pageOfDashboards.dashboards);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startAt, maxResults, total, prev, next, dashboards);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PageOfDashboards {\n");
    sb.append("    startAt: ").append(toIndentedString(startAt)).append("\n");
    sb.append("    maxResults: ").append(toIndentedString(maxResults)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    prev: ").append(toIndentedString(prev)).append("\n");
    sb.append("    next: ").append(toIndentedString(next)).append("\n");
    sb.append("    dashboards: ").append(toIndentedString(dashboards)).append("\n");
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
