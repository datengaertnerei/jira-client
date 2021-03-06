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
 * Details about a project type.
 */
@ApiModel(description = "Details about a project type.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-05-17T17:45:56.601554Z[Etc/UTC]")
public class ProjectType {
  public static final String SERIALIZED_NAME_KEY = "key";
  @SerializedName(SERIALIZED_NAME_KEY)
  private String key;

  public static final String SERIALIZED_NAME_FORMATTED_KEY = "formattedKey";
  @SerializedName(SERIALIZED_NAME_FORMATTED_KEY)
  private String formattedKey;

  public static final String SERIALIZED_NAME_DESCRIPTION_I18N_KEY = "descriptionI18nKey";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION_I18N_KEY)
  private String descriptionI18nKey;

  public static final String SERIALIZED_NAME_ICON = "icon";
  @SerializedName(SERIALIZED_NAME_ICON)
  private String icon;

  public static final String SERIALIZED_NAME_COLOR = "color";
  @SerializedName(SERIALIZED_NAME_COLOR)
  private String color;


   /**
   * The key of the project type.
   * @return key
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The key of the project type.")

  public String getKey() {
    return key;
  }




   /**
   * The formatted key of the project type.
   * @return formattedKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The formatted key of the project type.")

  public String getFormattedKey() {
    return formattedKey;
  }




   /**
   * The key of the project type&#39;s description.
   * @return descriptionI18nKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The key of the project type's description.")

  public String getDescriptionI18nKey() {
    return descriptionI18nKey;
  }




   /**
   * The icon of the project type.
   * @return icon
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The icon of the project type.")

  public String getIcon() {
    return icon;
  }




   /**
   * The color of the project type.
   * @return color
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The color of the project type.")

  public String getColor() {
    return color;
  }




  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectType projectType = (ProjectType) o;
    return Objects.equals(this.key, projectType.key) &&
        Objects.equals(this.formattedKey, projectType.formattedKey) &&
        Objects.equals(this.descriptionI18nKey, projectType.descriptionI18nKey) &&
        Objects.equals(this.icon, projectType.icon) &&
        Objects.equals(this.color, projectType.color);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, formattedKey, descriptionI18nKey, icon, color);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectType {\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    formattedKey: ").append(toIndentedString(formattedKey)).append("\n");
    sb.append("    descriptionI18nKey: ").append(toIndentedString(descriptionI18nKey)).append("\n");
    sb.append("    icon: ").append(toIndentedString(icon)).append("\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
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

