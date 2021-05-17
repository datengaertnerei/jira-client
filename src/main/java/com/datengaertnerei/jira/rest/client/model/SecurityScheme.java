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
import com.datengaertnerei.jira.rest.client.model.SecurityLevel;
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
 * Details about a security scheme.
 */
@ApiModel(description = "Details about a security scheme.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-05-17T17:45:56.601554Z[Etc/UTC]")
public class SecurityScheme {
  public static final String SERIALIZED_NAME_SELF = "self";
  @SerializedName(SERIALIZED_NAME_SELF)
  private String self;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_DEFAULT_SECURITY_LEVEL_ID = "defaultSecurityLevelId";
  @SerializedName(SERIALIZED_NAME_DEFAULT_SECURITY_LEVEL_ID)
  private Long defaultSecurityLevelId;

  public static final String SERIALIZED_NAME_LEVELS = "levels";
  @SerializedName(SERIALIZED_NAME_LEVELS)
  private List<SecurityLevel> levels = null;


   /**
   * The URL of the issue security scheme.
   * @return self
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The URL of the issue security scheme.")

  public String getSelf() {
    return self;
  }




   /**
   * The ID of the issue security scheme.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the issue security scheme.")

  public Long getId() {
    return id;
  }




   /**
   * The name of the issue security scheme.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the issue security scheme.")

  public String getName() {
    return name;
  }




   /**
   * The description of the issue security scheme.
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The description of the issue security scheme.")

  public String getDescription() {
    return description;
  }




   /**
   * The ID of the default security level.
   * @return defaultSecurityLevelId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the default security level.")

  public Long getDefaultSecurityLevelId() {
    return defaultSecurityLevelId;
  }




  public SecurityScheme levels(List<SecurityLevel> levels) {
    
    this.levels = levels;
    return this;
  }

  public SecurityScheme addLevelsItem(SecurityLevel levelsItem) {
    if (this.levels == null) {
      this.levels = new ArrayList<>();
    }
    this.levels.add(levelsItem);
    return this;
  }

   /**
   * Get levels
   * @return levels
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<SecurityLevel> getLevels() {
    return levels;
  }


  public void setLevels(List<SecurityLevel> levels) {
    this.levels = levels;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecurityScheme securityScheme = (SecurityScheme) o;
    return Objects.equals(this.self, securityScheme.self) &&
        Objects.equals(this.id, securityScheme.id) &&
        Objects.equals(this.name, securityScheme.name) &&
        Objects.equals(this.description, securityScheme.description) &&
        Objects.equals(this.defaultSecurityLevelId, securityScheme.defaultSecurityLevelId) &&
        Objects.equals(this.levels, securityScheme.levels);
  }

  @Override
  public int hashCode() {
    return Objects.hash(self, id, name, description, defaultSecurityLevelId, levels);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurityScheme {\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    defaultSecurityLevelId: ").append(toIndentedString(defaultSecurityLevelId)).append("\n");
    sb.append("    levels: ").append(toIndentedString(levels)).append("\n");
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
