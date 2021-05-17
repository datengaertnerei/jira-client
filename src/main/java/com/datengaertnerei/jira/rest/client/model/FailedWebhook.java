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
 * Details about a failed webhook.
 */
@ApiModel(description = "Details about a failed webhook.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-05-17T17:45:56.601554Z[Etc/UTC]")
public class FailedWebhook {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_BODY = "body";
  @SerializedName(SERIALIZED_NAME_BODY)
  private String body;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public static final String SERIALIZED_NAME_FAILURE_TIME = "failureTime";
  @SerializedName(SERIALIZED_NAME_FAILURE_TIME)
  private Long failureTime;


  public FailedWebhook id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * The webhook ID, as sent in the &#x60;X-Atlassian-Webhook-Identifier&#x60; header with the webhook.
   * @return id
  **/
  @ApiModelProperty(required = true, value = "The webhook ID, as sent in the `X-Atlassian-Webhook-Identifier` header with the webhook.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public FailedWebhook body(String body) {
    
    this.body = body;
    return this;
  }

   /**
   * The webhook body.
   * @return body
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The webhook body.")

  public String getBody() {
    return body;
  }


  public void setBody(String body) {
    this.body = body;
  }


  public FailedWebhook url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * The original webhook destination.
   * @return url
  **/
  @ApiModelProperty(required = true, value = "The original webhook destination.")

  public String getUrl() {
    return url;
  }


  public void setUrl(String url) {
    this.url = url;
  }


  public FailedWebhook failureTime(Long failureTime) {
    
    this.failureTime = failureTime;
    return this;
  }

   /**
   * The time the webhook was added to the list of failed webhooks (that is, the time of the last failed retry).
   * @return failureTime
  **/
  @ApiModelProperty(required = true, value = "The time the webhook was added to the list of failed webhooks (that is, the time of the last failed retry).")

  public Long getFailureTime() {
    return failureTime;
  }


  public void setFailureTime(Long failureTime) {
    this.failureTime = failureTime;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FailedWebhook failedWebhook = (FailedWebhook) o;
    return Objects.equals(this.id, failedWebhook.id) &&
        Objects.equals(this.body, failedWebhook.body) &&
        Objects.equals(this.url, failedWebhook.url) &&
        Objects.equals(this.failureTime, failedWebhook.failureTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, body, url, failureTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FailedWebhook {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    failureTime: ").append(toIndentedString(failureTime)).append("\n");
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

