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
import com.datengaertnerei.jira.rest.client.model.StatusCategory;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * A status.
 */
@ApiModel(description = "A status.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-05-17T17:45:56.601554Z[Etc/UTC]")
public class StatusDetails extends HashMap<String, Object> {
  public static final String SERIALIZED_NAME_SELF = "self";
  @SerializedName(SERIALIZED_NAME_SELF)
  private String self;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_ICON_URL = "iconUrl";
  @SerializedName(SERIALIZED_NAME_ICON_URL)
  private String iconUrl;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_STATUS_CATEGORY = "statusCategory";
  @SerializedName(SERIALIZED_NAME_STATUS_CATEGORY)
  private StatusCategory statusCategory;


   /**
   * The URL of the status.
   * @return self
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The URL of the status.")

  public String getSelf() {
    return self;
  }




   /**
   * The description of the status.
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The description of the status.")

  public String getDescription() {
    return description;
  }




   /**
   * The URL of the icon used to represent the status.
   * @return iconUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The URL of the icon used to represent the status.")

  public String getIconUrl() {
    return iconUrl;
  }




   /**
   * The name of the status.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the status.")

  public String getName() {
    return name;
  }




   /**
   * The ID of the status.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the status.")

  public String getId() {
    return id;
  }




   /**
   * The category assigned to the status.
   * @return statusCategory
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The category assigned to the status.")

  public StatusCategory getStatusCategory() {
    return statusCategory;
  }




  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StatusDetails statusDetails = (StatusDetails) o;
    return Objects.equals(this.self, statusDetails.self) &&
        Objects.equals(this.description, statusDetails.description) &&
        Objects.equals(this.iconUrl, statusDetails.iconUrl) &&
        Objects.equals(this.name, statusDetails.name) &&
        Objects.equals(this.id, statusDetails.id) &&
        Objects.equals(this.statusCategory, statusDetails.statusCategory) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(self, description, iconUrl, name, id, statusCategory, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatusDetails {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    iconUrl: ").append(toIndentedString(iconUrl)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    statusCategory: ").append(toIndentedString(statusCategory)).append("\n");
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

