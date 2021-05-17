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
 * The date the newly refreshed webhooks expire.
 */
@ApiModel(description = "The date the newly refreshed webhooks expire.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-05-17T17:45:56.601554Z[Etc/UTC]")
public class WebhooksExpirationDate {
  public static final String SERIALIZED_NAME_EXPIRATION_DATE = "expirationDate";
  @SerializedName(SERIALIZED_NAME_EXPIRATION_DATE)
  private Long expirationDate;


   /**
   * Get expirationDate
   * @return expirationDate
  **/
  @ApiModelProperty(required = true, value = "")

  public Long getExpirationDate() {
    return expirationDate;
  }




  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebhooksExpirationDate webhooksExpirationDate = (WebhooksExpirationDate) o;
    return Objects.equals(this.expirationDate, webhooksExpirationDate.expirationDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expirationDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhooksExpirationDate {\n");
    sb.append("    expirationDate: ").append(toIndentedString(expirationDate)).append("\n");
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

