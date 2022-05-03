/*
Copyright 2020 Twitter, Inc.
SPDX-License-Identifier: Apache-2.0

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.

NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
https://openapi-generator.tech
Do not edit the class manually.
*/


package com.twitter.clientlib.api;

import com.twitter.clientlib.TwitterCredentialsOAuth2;
import com.twitter.clientlib.ApiException;
import com.twitter.clientlib.model.Error;
import com.twitter.clientlib.model.ListAddMemberRequest;
import com.twitter.clientlib.model.ListCreateRequest;
import com.twitter.clientlib.model.ListCreateResponse;
import com.twitter.clientlib.model.ListDeleteResponse;
import com.twitter.clientlib.model.ListFollowRequest;
import com.twitter.clientlib.model.ListFollowedResponse;
import com.twitter.clientlib.model.ListMemberResponse;
import com.twitter.clientlib.model.ListPinRequest;
import com.twitter.clientlib.model.ListPinnedResponse;
import com.twitter.clientlib.model.ListUpdateRequest;
import com.twitter.clientlib.model.ListUpdateResponse;
import com.twitter.clientlib.model.MultiListNoPaginationResponse;
import com.twitter.clientlib.model.MultiListResponse;
import com.twitter.clientlib.model.Problem;
import java.util.Set;
import com.twitter.clientlib.model.SingleListLookupResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.io.InputStream;

/**
 * API tests for ListsApi
 */
@Disabled
public class ListsApiTest {

    private final TwitterApi apiInstance = new TwitterApi();
    // TODO set credentials
    
    /**
     * Get a User&#39;s List Memberships
     *
     * Get a User&#39;s List Memberships.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getUserListMembershipsTest() throws ApiException {
        String id = null;
        Integer maxResults = null;
        Long paginationToken = null;
        Set<String> listFields = null;
        Set<String> expansions = null;
        Set<String> userFields = null;
                MultiListResponse response = apiInstance.lists().getUserListMemberships(id, maxResults, paginationToken, listFields, expansions, userFields);
        // TODO: test validations
    }


    /**
     * Add a List member
     *
     * Causes a user to become a member of a List.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listAddMemberTest() throws ApiException {
        ListAddMemberRequest listAddMemberRequest = null;
        String id = null;
                ListMemberResponse response = apiInstance.lists().listAddMember(listAddMemberRequest, id);
        // TODO: test validations
    }


    /**
     * Create List
     *
     * Creates a new List.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listIdCreateTest() throws ApiException {
        ListCreateRequest listCreateRequest = null;
                ListCreateResponse response = apiInstance.lists().listIdCreate(listCreateRequest);
        // TODO: test validations
    }


    /**
     * Delete List
     *
     * Delete a List that you own.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listIdDeleteTest() throws ApiException {
        String id = null;
                ListDeleteResponse response = apiInstance.lists().listIdDelete(id);
        // TODO: test validations
    }


    /**
     * List lookup by List ID
     *
     * Returns a List
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listIdGetTest() throws ApiException {
        String id = null;
        Set<String> listFields = null;
        Set<String> expansions = null;
        Set<String> userFields = null;
                SingleListLookupResponse response = apiInstance.lists().listIdGet(id, listFields, expansions, userFields);
        // TODO: test validations
    }


    /**
     * Update List
     *
     * Update a List that you own.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listIdUpdateTest() throws ApiException {
        ListUpdateRequest listUpdateRequest = null;
        String id = null;
                ListUpdateResponse response = apiInstance.lists().listIdUpdate(listUpdateRequest, id);
        // TODO: test validations
    }


    /**
     * Remove a List member
     *
     * Causes a user to be removed from the members of a List.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listRemoveMemberTest() throws ApiException {
        String id = null;
        String userId = null;
                ListMemberResponse response = apiInstance.lists().listRemoveMember(id, userId);
        // TODO: test validations
    }


    /**
     * Follow a List
     *
     * Causes a user to follow a List.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listUserFollowTest() throws ApiException {
        ListFollowRequest listFollowRequest = null;
        String id = null;
                ListFollowedResponse response = apiInstance.lists().listUserFollow(listFollowRequest, id);
        // TODO: test validations
    }


    /**
     * Get a User&#39;s Owned Lists
     *
     * Get a User&#39;s Owned Lists.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listUserOwnedListsTest() throws ApiException {
        String id = null;
        Integer maxResults = null;
        Long paginationToken = null;
        Set<String> listFields = null;
        Set<String> expansions = null;
        Set<String> userFields = null;
                MultiListResponse response = apiInstance.lists().listUserOwnedLists(id, maxResults, paginationToken, listFields, expansions, userFields);
        // TODO: test validations
    }


    /**
     * Pin a List
     *
     * Causes a user to pin a List.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listUserPinTest() throws ApiException {
        ListPinRequest listPinRequest = null;
        String id = null;
                ListPinnedResponse response = apiInstance.lists().listUserPin(listPinRequest, id);
        // TODO: test validations
    }


    /**
     * Get a User&#39;s Pinned Lists
     *
     * Get a User&#39;s Pinned Lists.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listUserPinnedListsTest() throws ApiException {
        String id = null;
        Set<String> listFields = null;
        Set<String> expansions = null;
        Set<String> userFields = null;
                MultiListNoPaginationResponse response = apiInstance.lists().listUserPinnedLists(id, listFields, expansions, userFields);
        // TODO: test validations
    }


    /**
     * Unfollow a List
     *
     * Causes a user to unfollow a List.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listUserUnfollowTest() throws ApiException {
        String id = null;
        String listId = null;
                ListFollowedResponse response = apiInstance.lists().listUserUnfollow(id, listId);
        // TODO: test validations
    }


    /**
     * Unpin a List
     *
     * Causes a user to remove a pinned List.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listUserUnpinTest() throws ApiException {
        String id = null;
        String listId = null;
                ListPinnedResponse response = apiInstance.lists().listUserUnpin(id, listId);
        // TODO: test validations
    }


    /**
     * Get User&#39;s Followed Lists
     *
     * Returns a user&#39;s followed Lists.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void userFollowedListsTest() throws ApiException {
        String id = null;
        Integer maxResults = null;
        Long paginationToken = null;
        Set<String> listFields = null;
        Set<String> expansions = null;
        Set<String> userFields = null;
                MultiListResponse response = apiInstance.lists().userFollowedLists(id, maxResults, paginationToken, listFields, expansions, userFields);
        // TODO: test validations
    }

}
