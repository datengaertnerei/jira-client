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
import com.datengaertnerei.jira.rest.client.model.Icon;
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
 * The status of the item.
 */
@ApiModel(description = "The status of the item.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-05-17T17:45:56.601554Z[Etc/UTC]")
public class Status extends HashMap<String, Object> {
  public static final String SERIALIZED_NAME_RESOLVED = "resolved";
  @SerializedName(SERIALIZED_NAME_RESOLVED)
  private Boolean resolved;

  public static final String SERIALIZED_NAME_ICON = "icon";
  @SerializedName(SERIALIZED_NAME_ICON)
  private Icon icon;


  public Status resolved(Boolean resolved) {
    
    this.resolved = resolved;
    return this;
  }

   /**
   * Whether the item is resolved. If set to \&quot;true\&quot;, the link to the issue is displayed in a strikethrough font, otherwise the link displays in normal font.
   * @return resolved
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether the item is resolved. If set to \"true\", the link to the issue is displayed in a strikethrough font, otherwise the link displays in normal font.")

  public Boolean getResolved() {
    return resolved;
  }


  public void setResolved(Boolean resolved) {
    this.resolved = resolved;
  }


  public Status icon(Icon icon) {
    
    this.icon = icon;
    return this;
  }

   /**
   * Details of the icon representing the status. If not provided, no status icon displays in Jira.
   * @return icon
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Details of the icon representing the status. If not provided, no status icon displays in Jira.")

  public Icon getIcon() {
    return icon;
  }


  public void setIcon(Icon icon) {
    this.icon = icon;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Status status = (Status) o;
    return Objects.equals(this.resolved, status.resolved) &&
        Objects.equals(this.icon, status.icon) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resolved, icon, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Status {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    resolved: ").append(toIndentedString(resolved)).append("\n");
    sb.append("    icon: ").append(toIndentedString(icon)).append("\n");
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

