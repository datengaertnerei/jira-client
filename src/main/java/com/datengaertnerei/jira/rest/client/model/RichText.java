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
 * RichText
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-05-17T17:45:56.601554Z[Etc/UTC]")
public class RichText {
  public static final String SERIALIZED_NAME_EMPTY_ADF = "emptyAdf";
  @SerializedName(SERIALIZED_NAME_EMPTY_ADF)
  private Boolean emptyAdf;

  public static final String SERIALIZED_NAME_VALUE_SET = "valueSet";
  @SerializedName(SERIALIZED_NAME_VALUE_SET)
  private Boolean valueSet;

  public static final String SERIALIZED_NAME_FINALISED = "finalised";
  @SerializedName(SERIALIZED_NAME_FINALISED)
  private Boolean finalised;


  public RichText emptyAdf(Boolean emptyAdf) {
    
    this.emptyAdf = emptyAdf;
    return this;
  }

   /**
   * Get emptyAdf
   * @return emptyAdf
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getEmptyAdf() {
    return emptyAdf;
  }


  public void setEmptyAdf(Boolean emptyAdf) {
    this.emptyAdf = emptyAdf;
  }


  public RichText valueSet(Boolean valueSet) {
    
    this.valueSet = valueSet;
    return this;
  }

   /**
   * Get valueSet
   * @return valueSet
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getValueSet() {
    return valueSet;
  }


  public void setValueSet(Boolean valueSet) {
    this.valueSet = valueSet;
  }


  public RichText finalised(Boolean finalised) {
    
    this.finalised = finalised;
    return this;
  }

   /**
   * Get finalised
   * @return finalised
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getFinalised() {
    return finalised;
  }


  public void setFinalised(Boolean finalised) {
    this.finalised = finalised;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RichText richText = (RichText) o;
    return Objects.equals(this.emptyAdf, richText.emptyAdf) &&
        Objects.equals(this.valueSet, richText.valueSet) &&
        Objects.equals(this.finalised, richText.finalised);
  }

  @Override
  public int hashCode() {
    return Objects.hash(emptyAdf, valueSet, finalised);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RichText {\n");
    sb.append("    emptyAdf: ").append(toIndentedString(emptyAdf)).append("\n");
    sb.append("    valueSet: ").append(toIndentedString(valueSet)).append("\n");
    sb.append("    finalised: ").append(toIndentedString(finalised)).append("\n");
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

