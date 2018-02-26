// Copyright 2013 Google Inc. All Rights Reserved.

package com.phponacid.contacts.common.extensions;

import android.content.Context;

import com.phponacid.contacts.common.list.DirectoryPartition;
import com.phponacid.contacts.common.list.PhoneNumberListAdapter;

import java.util.List;

/**
 * An interface for adding extended phone directories to
 * {@link PhoneNumberListAdapter}.
 * An app that wishes to add custom phone directories should implement this class and advertise it
 * in assets/contacts_extensions.properties. {@link ExtensionsFactory} will load the implementation
 * and the extended directories will be added by
 * {@link PhoneNumberListAdapter}.
 */
public interface ExtendedPhoneDirectoriesManager {

    /**
     * Return a list of extended directories to add. May return null if no directories are to be
     * added.
     */
    List<DirectoryPartition> getExtendedDirectories(Context context);
}
