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
import com.datengaertnerei.jira.rest.client.model.AttachmentArchiveEntry;
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
 * AttachmentArchiveImpl
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-05-17T17:45:56.601554Z[Etc/UTC]")
public class AttachmentArchiveImpl {
  public static final String SERIALIZED_NAME_ENTRIES = "entries";
  @SerializedName(SERIALIZED_NAME_ENTRIES)
  private List<AttachmentArchiveEntry> entries = null;

  public static final String SERIALIZED_NAME_TOTAL_ENTRY_COUNT = "totalEntryCount";
  @SerializedName(SERIALIZED_NAME_TOTAL_ENTRY_COUNT)
  private Integer totalEntryCount;


  public AttachmentArchiveImpl entries(List<AttachmentArchiveEntry> entries) {
    
    this.entries = entries;
    return this;
  }

  public AttachmentArchiveImpl addEntriesItem(AttachmentArchiveEntry entriesItem) {
    if (this.entries == null) {
      this.entries = new ArrayList<>();
    }
    this.entries.add(entriesItem);
    return this;
  }

   /**
   * The list of the items included in the archive.
   * @return entries
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The list of the items included in the archive.")

  public List<AttachmentArchiveEntry> getEntries() {
    return entries;
  }


  public void setEntries(List<AttachmentArchiveEntry> entries) {
    this.entries = entries;
  }


  public AttachmentArchiveImpl totalEntryCount(Integer totalEntryCount) {
    
    this.totalEntryCount = totalEntryCount;
    return this;
  }

   /**
   * The number of items in the archive.
   * @return totalEntryCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of items in the archive.")

  public Integer getTotalEntryCount() {
    return totalEntryCount;
  }


  public void setTotalEntryCount(Integer totalEntryCount) {
    this.totalEntryCount = totalEntryCount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AttachmentArchiveImpl attachmentArchiveImpl = (AttachmentArchiveImpl) o;
    return Objects.equals(this.entries, attachmentArchiveImpl.entries) &&
        Objects.equals(this.totalEntryCount, attachmentArchiveImpl.totalEntryCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entries, totalEntryCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AttachmentArchiveImpl {\n");
    sb.append("    entries: ").append(toIndentedString(entries)).append("\n");
    sb.append("    totalEntryCount: ").append(toIndentedString(totalEntryCount)).append("\n");
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

