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
import java.util.HashMap;
import java.util.Map;

/**
 * A status category.
 */
@ApiModel(description = "A status category.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-05-17T17:45:56.601554Z[Etc/UTC]")
public class StatusCategory extends HashMap<String, Object> {
  public static final String SERIALIZED_NAME_SELF = "self";
  @SerializedName(SERIALIZED_NAME_SELF)
  private String self;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id;

  public static final String SERIALIZED_NAME_KEY = "key";
  @SerializedName(SERIALIZED_NAME_KEY)
  private String key;

  public static final String SERIALIZED_NAME_COLOR_NAME = "colorName";
  @SerializedName(SERIALIZED_NAME_COLOR_NAME)
  private String colorName;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;


   /**
   * The URL of the status category.
   * @return self
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The URL of the status category.")

  public String getSelf() {
    return self;
  }




   /**
   * The ID of the status category.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the status category.")

  public Long getId() {
    return id;
  }




   /**
   * The key of the status category.
   * @return key
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The key of the status category.")

  public String getKey() {
    return key;
  }




   /**
   * The name of the color used to represent the status category.
   * @return colorName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the color used to represent the status category.")

  public String getColorName() {
    return colorName;
  }




   /**
   * The name of the status category.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the status category.")

  public String getName() {
    return name;
  }




  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StatusCategory statusCategory = (StatusCategory) o;
    return Objects.equals(this.self, statusCategory.self) &&
        Objects.equals(this.id, statusCategory.id) &&
        Objects.equals(this.key, statusCategory.key) &&
        Objects.equals(this.colorName, statusCategory.colorName) &&
        Objects.equals(this.name, statusCategory.name) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(self, id, key, colorName, name, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatusCategory {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    colorName: ").append(toIndentedString(colorName)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

