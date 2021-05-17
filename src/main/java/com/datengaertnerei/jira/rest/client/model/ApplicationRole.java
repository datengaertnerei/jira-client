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
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/**
 * Details of an application role.
 */
@ApiModel(description = "Details of an application role.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-05-17T17:45:56.601554Z[Etc/UTC]")
public class ApplicationRole {
  public static final String SERIALIZED_NAME_KEY = "key";
  @SerializedName(SERIALIZED_NAME_KEY)
  private String key;

  public static final String SERIALIZED_NAME_GROUPS = "groups";
  @SerializedName(SERIALIZED_NAME_GROUPS)
  private Set<String> groups = null;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DEFAULT_GROUPS = "defaultGroups";
  @SerializedName(SERIALIZED_NAME_DEFAULT_GROUPS)
  private Set<String> defaultGroups = null;

  public static final String SERIALIZED_NAME_SELECTED_BY_DEFAULT = "selectedByDefault";
  @SerializedName(SERIALIZED_NAME_SELECTED_BY_DEFAULT)
  private Boolean selectedByDefault;

  public static final String SERIALIZED_NAME_DEFINED = "defined";
  @SerializedName(SERIALIZED_NAME_DEFINED)
  private Boolean defined;

  public static final String SERIALIZED_NAME_NUMBER_OF_SEATS = "numberOfSeats";
  @SerializedName(SERIALIZED_NAME_NUMBER_OF_SEATS)
  private Integer numberOfSeats;

  public static final String SERIALIZED_NAME_REMAINING_SEATS = "remainingSeats";
  @SerializedName(SERIALIZED_NAME_REMAINING_SEATS)
  private Integer remainingSeats;

  public static final String SERIALIZED_NAME_USER_COUNT = "userCount";
  @SerializedName(SERIALIZED_NAME_USER_COUNT)
  private Integer userCount;

  public static final String SERIALIZED_NAME_USER_COUNT_DESCRIPTION = "userCountDescription";
  @SerializedName(SERIALIZED_NAME_USER_COUNT_DESCRIPTION)
  private String userCountDescription;

  public static final String SERIALIZED_NAME_HAS_UNLIMITED_SEATS = "hasUnlimitedSeats";
  @SerializedName(SERIALIZED_NAME_HAS_UNLIMITED_SEATS)
  private Boolean hasUnlimitedSeats;

  public static final String SERIALIZED_NAME_PLATFORM = "platform";
  @SerializedName(SERIALIZED_NAME_PLATFORM)
  private Boolean platform;


  public ApplicationRole key(String key) {
    
    this.key = key;
    return this;
  }

   /**
   * The key of the application role.
   * @return key
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The key of the application role.")

  public String getKey() {
    return key;
  }


  public void setKey(String key) {
    this.key = key;
  }


  public ApplicationRole groups(Set<String> groups) {
    
    this.groups = groups;
    return this;
  }

  public ApplicationRole addGroupsItem(String groupsItem) {
    if (this.groups == null) {
      this.groups = new LinkedHashSet<>();
    }
    this.groups.add(groupsItem);
    return this;
  }

   /**
   * The groups associated with the application role.
   * @return groups
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The groups associated with the application role.")

  public Set<String> getGroups() {
    return groups;
  }


  public void setGroups(Set<String> groups) {
    this.groups = groups;
  }


  public ApplicationRole name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The display name of the application role.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The display name of the application role.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public ApplicationRole defaultGroups(Set<String> defaultGroups) {
    
    this.defaultGroups = defaultGroups;
    return this;
  }

  public ApplicationRole addDefaultGroupsItem(String defaultGroupsItem) {
    if (this.defaultGroups == null) {
      this.defaultGroups = new LinkedHashSet<>();
    }
    this.defaultGroups.add(defaultGroupsItem);
    return this;
  }

   /**
   * The groups that are granted default access for this application role.
   * @return defaultGroups
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The groups that are granted default access for this application role.")

  public Set<String> getDefaultGroups() {
    return defaultGroups;
  }


  public void setDefaultGroups(Set<String> defaultGroups) {
    this.defaultGroups = defaultGroups;
  }


  public ApplicationRole selectedByDefault(Boolean selectedByDefault) {
    
    this.selectedByDefault = selectedByDefault;
    return this;
  }

   /**
   * Determines whether this application role should be selected by default on user creation.
   * @return selectedByDefault
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Determines whether this application role should be selected by default on user creation.")

  public Boolean getSelectedByDefault() {
    return selectedByDefault;
  }


  public void setSelectedByDefault(Boolean selectedByDefault) {
    this.selectedByDefault = selectedByDefault;
  }


  public ApplicationRole defined(Boolean defined) {
    
    this.defined = defined;
    return this;
  }

   /**
   * Deprecated.
   * @return defined
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Deprecated.")

  public Boolean getDefined() {
    return defined;
  }


  public void setDefined(Boolean defined) {
    this.defined = defined;
  }


  public ApplicationRole numberOfSeats(Integer numberOfSeats) {
    
    this.numberOfSeats = numberOfSeats;
    return this;
  }

   /**
   * The maximum count of users on your license.
   * @return numberOfSeats
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The maximum count of users on your license.")

  public Integer getNumberOfSeats() {
    return numberOfSeats;
  }


  public void setNumberOfSeats(Integer numberOfSeats) {
    this.numberOfSeats = numberOfSeats;
  }


  public ApplicationRole remainingSeats(Integer remainingSeats) {
    
    this.remainingSeats = remainingSeats;
    return this;
  }

   /**
   * The count of users remaining on your license.
   * @return remainingSeats
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The count of users remaining on your license.")

  public Integer getRemainingSeats() {
    return remainingSeats;
  }


  public void setRemainingSeats(Integer remainingSeats) {
    this.remainingSeats = remainingSeats;
  }


  public ApplicationRole userCount(Integer userCount) {
    
    this.userCount = userCount;
    return this;
  }

   /**
   * The number of users counting against your license.
   * @return userCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of users counting against your license.")

  public Integer getUserCount() {
    return userCount;
  }


  public void setUserCount(Integer userCount) {
    this.userCount = userCount;
  }


  public ApplicationRole userCountDescription(String userCountDescription) {
    
    this.userCountDescription = userCountDescription;
    return this;
  }

   /**
   * The [type of users](https://confluence.atlassian.com/x/lRW3Ng) being counted against your license.
   * @return userCountDescription
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The [type of users](https://confluence.atlassian.com/x/lRW3Ng) being counted against your license.")

  public String getUserCountDescription() {
    return userCountDescription;
  }


  public void setUserCountDescription(String userCountDescription) {
    this.userCountDescription = userCountDescription;
  }


  public ApplicationRole hasUnlimitedSeats(Boolean hasUnlimitedSeats) {
    
    this.hasUnlimitedSeats = hasUnlimitedSeats;
    return this;
  }

   /**
   * Get hasUnlimitedSeats
   * @return hasUnlimitedSeats
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getHasUnlimitedSeats() {
    return hasUnlimitedSeats;
  }


  public void setHasUnlimitedSeats(Boolean hasUnlimitedSeats) {
    this.hasUnlimitedSeats = hasUnlimitedSeats;
  }


  public ApplicationRole platform(Boolean platform) {
    
    this.platform = platform;
    return this;
  }

   /**
   * Indicates if the application role belongs to Jira platform (&#x60;jira-core&#x60;).
   * @return platform
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates if the application role belongs to Jira platform (`jira-core`).")

  public Boolean getPlatform() {
    return platform;
  }


  public void setPlatform(Boolean platform) {
    this.platform = platform;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApplicationRole applicationRole = (ApplicationRole) o;
    return Objects.equals(this.key, applicationRole.key) &&
        Objects.equals(this.groups, applicationRole.groups) &&
        Objects.equals(this.name, applicationRole.name) &&
        Objects.equals(this.defaultGroups, applicationRole.defaultGroups) &&
        Objects.equals(this.selectedByDefault, applicationRole.selectedByDefault) &&
        Objects.equals(this.defined, applicationRole.defined) &&
        Objects.equals(this.numberOfSeats, applicationRole.numberOfSeats) &&
        Objects.equals(this.remainingSeats, applicationRole.remainingSeats) &&
        Objects.equals(this.userCount, applicationRole.userCount) &&
        Objects.equals(this.userCountDescription, applicationRole.userCountDescription) &&
        Objects.equals(this.hasUnlimitedSeats, applicationRole.hasUnlimitedSeats) &&
        Objects.equals(this.platform, applicationRole.platform);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, groups, name, defaultGroups, selectedByDefault, defined, numberOfSeats, remainingSeats, userCount, userCountDescription, hasUnlimitedSeats, platform);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplicationRole {\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    defaultGroups: ").append(toIndentedString(defaultGroups)).append("\n");
    sb.append("    selectedByDefault: ").append(toIndentedString(selectedByDefault)).append("\n");
    sb.append("    defined: ").append(toIndentedString(defined)).append("\n");
    sb.append("    numberOfSeats: ").append(toIndentedString(numberOfSeats)).append("\n");
    sb.append("    remainingSeats: ").append(toIndentedString(remainingSeats)).append("\n");
    sb.append("    userCount: ").append(toIndentedString(userCount)).append("\n");
    sb.append("    userCountDescription: ").append(toIndentedString(userCountDescription)).append("\n");
    sb.append("    hasUnlimitedSeats: ").append(toIndentedString(hasUnlimitedSeats)).append("\n");
    sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
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

