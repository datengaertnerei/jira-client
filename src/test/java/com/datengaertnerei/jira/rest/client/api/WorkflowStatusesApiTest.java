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
import com.datengaertnerei.jira.rest.client.model.StatusDetails;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for WorkflowStatusesApi
 */
@Ignore
public class WorkflowStatusesApiTest {

    private final WorkflowStatusesApi api = new WorkflowStatusesApi();

    
    /**
     * Get status
     *
     * Returns a status. The status must be associated with a workflow to be returned.  If a name is used on more than one status, only the status found first is returned. Therefore, identifying the status by its ID may be preferable.  This operation can be accessed anonymously.  [Permissions](#permissions) required: None.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getStatusTest() throws ApiException {
        String idOrName = null;
        StatusDetails response = api.getStatus(idOrName);

        // TODO: test validations
    }
    
    /**
     * Get all statuses
     *
     * Returns a list of all statuses associated with workflows.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** None.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getStatusesTest() throws ApiException {
        List<StatusDetails> response = api.getStatuses();

        // TODO: test validations
    }
    
}
