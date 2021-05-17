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
import com.datengaertnerei.jira.rest.client.model.FailedWebhook;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;

/**
 * A page of failed webhooks.
 */
@ApiModel(description = "A page of failed webhooks.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-05-17T17:45:56.601554Z[Etc/UTC]")
public class FailedWebhooks {
  public static final String SERIALIZED_NAME_VALUES = "values";
  @SerializedName(SERIALIZED_NAME_VALUES)
  private List<FailedWebhook> values = new ArrayList<>();

  public static final String SERIALIZED_NAME_MAX_RESULTS = "maxResults";
  @SerializedName(SERIALIZED_NAME_MAX_RESULTS)
  private Integer maxResults;

  public static final String SERIALIZED_NAME_NEXT = "next";
  @SerializedName(SERIALIZED_NAME_NEXT)
  private URI next;


  public FailedWebhooks values(List<FailedWebhook> values) {
    
    this.values = values;
    return this;
  }

  public FailedWebhooks addValuesItem(FailedWebhook valuesItem) {
    this.values.add(valuesItem);
    return this;
  }

   /**
   * The list of webhooks.
   * @return values
  **/
  @ApiModelProperty(required = true, value = "The list of webhooks.")

  public List<FailedWebhook> getValues() {
    return values;
  }


  public void setValues(List<FailedWebhook> values) {
    this.values = values;
  }


  public FailedWebhooks maxResults(Integer maxResults) {
    
    this.maxResults = maxResults;
    return this;
  }

   /**
   * The maximum number of items on the page. If the list of values is shorter than this number, then there are no more pages.
   * @return maxResults
  **/
  @ApiModelProperty(required = true, value = "The maximum number of items on the page. If the list of values is shorter than this number, then there are no more pages.")

  public Integer getMaxResults() {
    return maxResults;
  }


  public void setMaxResults(Integer maxResults) {
    this.maxResults = maxResults;
  }


  public FailedWebhooks next(URI next) {
    
    this.next = next;
    return this;
  }

   /**
   * The URL to the next page of results. Present only if the request returned at least one result.The next page may be empty at the time of receiving the response, but new failed webhooks may appear in time. You can save the URL to the next page and query for new results periodically (for example, every hour).
   * @return next
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The URL to the next page of results. Present only if the request returned at least one result.The next page may be empty at the time of receiving the response, but new failed webhooks may appear in time. You can save the URL to the next page and query for new results periodically (for example, every hour).")

  public URI getNext() {
    return next;
  }


  public void setNext(URI next) {
    this.next = next;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FailedWebhooks failedWebhooks = (FailedWebhooks) o;
    return Objects.equals(this.values, failedWebhooks.values) &&
        Objects.equals(this.maxResults, failedWebhooks.maxResults) &&
        Objects.equals(this.next, failedWebhooks.next);
  }

  @Override
  public int hashCode() {
    return Objects.hash(values, maxResults, next);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FailedWebhooks {\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
    sb.append("    maxResults: ").append(toIndentedString(maxResults)).append("\n");
    sb.append("    next: ").append(toIndentedString(next)).append("\n");
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

