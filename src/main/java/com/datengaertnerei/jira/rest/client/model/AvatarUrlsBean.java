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
import java.net.URI;

/**
 * AvatarUrlsBean
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-05-17T17:45:56.601554Z[Etc/UTC]")
public class AvatarUrlsBean {
  public static final String SERIALIZED_NAME_16X16 = "16x16";
  @SerializedName(SERIALIZED_NAME_16X16)
  private URI _16x16;

  public static final String SERIALIZED_NAME_24X24 = "24x24";
  @SerializedName(SERIALIZED_NAME_24X24)
  private URI _24x24;

  public static final String SERIALIZED_NAME_32X32 = "32x32";
  @SerializedName(SERIALIZED_NAME_32X32)
  private URI _32x32;

  public static final String SERIALIZED_NAME_48X48 = "48x48";
  @SerializedName(SERIALIZED_NAME_48X48)
  private URI _48x48;


  public AvatarUrlsBean _16x16(URI _16x16) {
    
    this._16x16 = _16x16;
    return this;
  }

   /**
   * The URL of the item&#39;s 16x16 pixel avatar.
   * @return _16x16
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The URL of the item's 16x16 pixel avatar.")

  public URI get16x16() {
    return _16x16;
  }


  public void set16x16(URI _16x16) {
    this._16x16 = _16x16;
  }


  public AvatarUrlsBean _24x24(URI _24x24) {
    
    this._24x24 = _24x24;
    return this;
  }

   /**
   * The URL of the item&#39;s 24x24 pixel avatar.
   * @return _24x24
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The URL of the item's 24x24 pixel avatar.")

  public URI get24x24() {
    return _24x24;
  }


  public void set24x24(URI _24x24) {
    this._24x24 = _24x24;
  }


  public AvatarUrlsBean _32x32(URI _32x32) {
    
    this._32x32 = _32x32;
    return this;
  }

   /**
   * The URL of the item&#39;s 32x32 pixel avatar.
   * @return _32x32
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The URL of the item's 32x32 pixel avatar.")

  public URI get32x32() {
    return _32x32;
  }


  public void set32x32(URI _32x32) {
    this._32x32 = _32x32;
  }


  public AvatarUrlsBean _48x48(URI _48x48) {
    
    this._48x48 = _48x48;
    return this;
  }

   /**
   * The URL of the item&#39;s 48x48 pixel avatar.
   * @return _48x48
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The URL of the item's 48x48 pixel avatar.")

  public URI get48x48() {
    return _48x48;
  }


  public void set48x48(URI _48x48) {
    this._48x48 = _48x48;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AvatarUrlsBean avatarUrlsBean = (AvatarUrlsBean) o;
    return Objects.equals(this._16x16, avatarUrlsBean._16x16) &&
        Objects.equals(this._24x24, avatarUrlsBean._24x24) &&
        Objects.equals(this._32x32, avatarUrlsBean._32x32) &&
        Objects.equals(this._48x48, avatarUrlsBean._48x48);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_16x16, _24x24, _32x32, _48x48);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AvatarUrlsBean {\n");
    sb.append("    _16x16: ").append(toIndentedString(_16x16)).append("\n");
    sb.append("    _24x24: ").append(toIndentedString(_24x24)).append("\n");
    sb.append("    _32x32: ").append(toIndentedString(_32x32)).append("\n");
    sb.append("    _48x48: ").append(toIndentedString(_48x48)).append("\n");
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

