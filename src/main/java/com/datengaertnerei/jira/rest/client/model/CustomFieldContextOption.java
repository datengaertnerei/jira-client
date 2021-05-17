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
 * Details of the custom field options for a context.
 */
@ApiModel(description = "Details of the custom field options for a context.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-05-17T17:45:56.601554Z[Etc/UTC]")
public class CustomFieldContextOption {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private String value;

  public static final String SERIALIZED_NAME_OPTION_ID = "optionId";
  @SerializedName(SERIALIZED_NAME_OPTION_ID)
  private String optionId;

  public static final String SERIALIZED_NAME_DISABLED = "disabled";
  @SerializedName(SERIALIZED_NAME_DISABLED)
  private Boolean disabled;


  public CustomFieldContextOption id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * The ID of the custom field option.
   * @return id
  **/
  @ApiModelProperty(required = true, value = "The ID of the custom field option.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public CustomFieldContextOption value(String value) {
    
    this.value = value;
    return this;
  }

   /**
   * The value of the custom field option.
   * @return value
  **/
  @ApiModelProperty(required = true, value = "The value of the custom field option.")

  public String getValue() {
    return value;
  }


  public void setValue(String value) {
    this.value = value;
  }


  public CustomFieldContextOption optionId(String optionId) {
    
    this.optionId = optionId;
    return this;
  }

   /**
   * For cascading options, the ID of the custom field option containing the cascading option.
   * @return optionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "For cascading options, the ID of the custom field option containing the cascading option.")

  public String getOptionId() {
    return optionId;
  }


  public void setOptionId(String optionId) {
    this.optionId = optionId;
  }


  public CustomFieldContextOption disabled(Boolean disabled) {
    
    this.disabled = disabled;
    return this;
  }

   /**
   * Whether the option is disabled.
   * @return disabled
  **/
  @ApiModelProperty(required = true, value = "Whether the option is disabled.")

  public Boolean getDisabled() {
    return disabled;
  }


  public void setDisabled(Boolean disabled) {
    this.disabled = disabled;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomFieldContextOption customFieldContextOption = (CustomFieldContextOption) o;
    return Objects.equals(this.id, customFieldContextOption.id) &&
        Objects.equals(this.value, customFieldContextOption.value) &&
        Objects.equals(this.optionId, customFieldContextOption.optionId) &&
        Objects.equals(this.disabled, customFieldContextOption.disabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, value, optionId, disabled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomFieldContextOption {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    optionId: ").append(toIndentedString(optionId)).append("\n");
    sb.append("    disabled: ").append(toIndentedString(disabled)).append("\n");
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

