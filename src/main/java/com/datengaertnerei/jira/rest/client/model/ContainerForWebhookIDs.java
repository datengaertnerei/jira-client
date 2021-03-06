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
import java.util.ArrayList;
import java.util.List;

/**
 * Container for a list of webhook IDs.
 */
@ApiModel(description = "Container for a list of webhook IDs.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-05-17T17:45:56.601554Z[Etc/UTC]")
public class ContainerForWebhookIDs {
  public static final String SERIALIZED_NAME_WEBHOOK_IDS = "webhookIds";
  @SerializedName(SERIALIZED_NAME_WEBHOOK_IDS)
  private List<Long> webhookIds = new ArrayList<>();


  public ContainerForWebhookIDs webhookIds(List<Long> webhookIds) {
    
    this.webhookIds = webhookIds;
    return this;
  }

  public ContainerForWebhookIDs addWebhookIdsItem(Long webhookIdsItem) {
    this.webhookIds.add(webhookIdsItem);
    return this;
  }

   /**
   * A list of webhook IDs.
   * @return webhookIds
  **/
  @ApiModelProperty(required = true, value = "A list of webhook IDs.")

  public List<Long> getWebhookIds() {
    return webhookIds;
  }


  public void setWebhookIds(List<Long> webhookIds) {
    this.webhookIds = webhookIds;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContainerForWebhookIDs containerForWebhookIDs = (ContainerForWebhookIDs) o;
    return Objects.equals(this.webhookIds, containerForWebhookIDs.webhookIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(webhookIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContainerForWebhookIDs {\n");
    sb.append("    webhookIds: ").append(toIndentedString(webhookIds)).append("\n");
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

