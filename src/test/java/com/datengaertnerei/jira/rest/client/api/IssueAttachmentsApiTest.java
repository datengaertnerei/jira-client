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


package com.datengaertnerei.jira.rest.client.api;

import com.datengaertnerei.jira.rest.client.ApiException;
import com.datengaertnerei.jira.rest.client.model.Attachment;
import com.datengaertnerei.jira.rest.client.model.AttachmentArchiveImpl;
import com.datengaertnerei.jira.rest.client.model.AttachmentArchiveMetadataReadable;
import com.datengaertnerei.jira.rest.client.model.AttachmentMetadata;
import com.datengaertnerei.jira.rest.client.model.AttachmentSettings;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for IssueAttachmentsApi
 */
@Ignore
public class IssueAttachmentsApiTest {

    private final IssueAttachmentsApi api = new IssueAttachmentsApi();

    
    /**
     * Add attachment
     *
     * Adds one or more attachments to an issue. Attachments are posted as multipart/form-data ([RFC 1867](https://www.ietf.org/rfc/rfc1867.txt)).  Note that:   *  The request must have a &#x60;X-Atlassian-Token: no-check&#x60; header, if not it is blocked. See [Special headers](#special-request-headers) for more information.  *  The name of the multipart/form-data parameter that contains the attachments must be &#x60;file&#x60;.  The following example uploads a file called *myfile.txt* to the issue *TEST-123*:  &#x60;curl -D- -u admin:admin -X POST -H \&quot;X-Atlassian-Token: no-check\&quot; -F \&quot;file&#x3D;@myfile.txt\&quot; https://your-domain.atlassian.net/rest/api/3/issue/TEST-123/attachments&#x60;  Tip: Use a client library. Many client libraries have classes for handling multipart POST operations. For example, in Java, the Apache HTTP Components library provides a [MultiPartEntity](http://hc.apache.org/httpcomponents-client-ga/httpmime/apidocs/org/apache/http/entity/mime/MultipartEntity.html) class for multipart POST operations.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:**    *  *Browse Projects* and *Create attachments* [ project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is in.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addAttachmentTest() throws ApiException {
        String issueIdOrKey = null;
        List<Attachment> response = api.addAttachment(issueIdOrKey);

        // TODO: test validations
    }
    
    /**
     * Get all metadata for an expanded attachment
     *
     * Returns the metadata for the contents of an attachment, if it is an archive, and metadata for the attachment itself. For example, if the attachment is a ZIP archive, then information about the files in the archive is returned and metadata for the ZIP archive. Currently, only the ZIP archive format is supported.  Use this operation to retrieve data that is presented to the user, as this operation returns the metadata for the attachment itself, such as the attachment&#39;s ID and name. Otherwise, use [ Get contents metadata for an expanded attachment](#api-rest-api-3-attachment-id-expand-raw-get), which only returns the metadata for the attachment&#39;s contents.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** For the issue containing the attachment:   *  *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is in.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void expandAttachmentForHumansTest() throws ApiException {
        String id = null;
        AttachmentArchiveMetadataReadable response = api.expandAttachmentForHumans(id);

        // TODO: test validations
    }
    
    /**
     * Get contents metadata for an expanded attachment
     *
     * Returns the metadata for the contents of an attachment, if it is an archive. For example, if the attachment is a ZIP archive, then information about the files in the archive is returned. Currently, only the ZIP archive format is supported.  Use this operation if you are processing the data without presenting it to the user, as this operation only returns the metadata for the contents of the attachment. Otherwise, to retrieve data to present to the user, use [ Get all metadata for an expanded attachment](#api-rest-api-3-attachment-id-expand-human-get) which also returns the metadata for the attachment itself, such as the attachment&#39;s ID and name.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** For the issue containing the attachment:   *  *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is in.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void expandAttachmentForMachinesTest() throws ApiException {
        String id = null;
        AttachmentArchiveImpl response = api.expandAttachmentForMachines(id);

        // TODO: test validations
    }
    
    /**
     * Get attachment metadata
     *
     * Returns the metadata for an attachment. Note that the attachment itself is not returned.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:**   *  *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is in.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAttachmentTest() throws ApiException {
        String id = null;
        AttachmentMetadata response = api.getAttachment(id);

        // TODO: test validations
    }
    
    /**
     * Get Jira attachment settings
     *
     * Returns the attachment settings, that is, whether attachments are enabled and the maximum attachment size allowed.  Note that there are also [project permissions](https://confluence.atlassian.com/x/yodKLg) that restrict whether users can create and delete attachments.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** None.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAttachmentMetaTest() throws ApiException {
        AttachmentSettings response = api.getAttachmentMeta();

        // TODO: test validations
    }
    
    /**
     * Delete attachment
     *
     * Deletes an attachment from an issue.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** For the project holding the issue containing the attachment:   *  *Delete own attachments* [project permission](https://confluence.atlassian.com/x/yodKLg) to delete an attachment created by the calling user.  *  *Delete all attachments* [project permission](https://confluence.atlassian.com/x/yodKLg) to delete an attachment created by any user.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void removeAttachmentTest() throws ApiException {
        String id = null;
        api.removeAttachment(id);

        // TODO: test validations
    }
    
}
