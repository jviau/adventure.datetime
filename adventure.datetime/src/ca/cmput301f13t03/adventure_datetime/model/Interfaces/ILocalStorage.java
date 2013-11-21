/*
 *        Copyright (c) 2013 Andrew Fontaine, James Finlay, Jesse Tucker, Jacob Viau, and
 *         Evan DeGraff
 *
 *         Permission is hereby granted, free of charge, to any person obtaining a copy of
 *         this software and associated documentation files (the "Software"), to deal in
 *         the Software without restriction, including without limitation the rights to
 *         use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of
 *         the Software, and to permit persons to whom the Software is furnished to do so,
 *         subject to the following conditions:
 *
 *         The above copyright notice and this permission notice shall be included in all
 *         copies or substantial portions of the Software.
 *
 *         THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 *         IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS
 *         FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR
 *         COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER
 *         IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN
 *         CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package ca.cmput301f13t03.adventure_datetime.model.Interfaces;

import java.util.ArrayList;
import java.util.UUID;

import ca.cmput301f13t03.adventure_datetime.model.Bookmark;
import ca.cmput301f13t03.adventure_datetime.model.Story;
import ca.cmput301f13t03.adventure_datetime.model.StoryFragment;

public interface ILocalStorage {

	/**
	 * Grabs a story with the given id from the local database
	 *
	 * @param id The GUID of the story
	 *
	 * @return The Story object or null if the id doesn't exist in the database
	 */
	public abstract Story getStory(UUID id);

	/**
	 * Retrieves all stories located on local storage
	 *
	 * @return Collection of all stories on local storage. Collection is empty if there are no stories
	 */
	public abstract ArrayList<Story> getStories();

	/**
	 * Retrieves all stories located on local storage by an author
	 *
	 * @return Collection of all stories on local storage by an author. Collection is empty if there are no stories by
	 *         author.
	 *
	 * @return Collection of all stories on local storage by an author. Collection is empty if there are no stories by
	 *         author.
	 */
	public abstract ArrayList<Story> getStoriesAuthoredBy(String author);

	/**
	 * Retrieves story fragments by specific ID from local storage
	 *
	 * @param id The GUID of the fragment
	 *
	 * @return StoryFragment instance or null
	 */
	public abstract StoryFragment getStoryFragment(UUID id);

	/**
	 * Retrieves all StoryFragments for a particular Story's _ID
	 *
	 * @param storyid The _ID for a story
	 *
	 * @return A Collection of StoryFragments. Empty if none exist.
	 */
	public abstract ArrayList<StoryFragment> getStoryFragments(UUID storyid);

	/**
	 * Gets the Bookmark from the story ID
	 *
	 * @param storyid The _ID of the story
	 *
	 * @return The Bookmark object
	 */
	public abstract Bookmark getBookmark(UUID storyid);

	/**
	 * Gets all Bookmarks in the database
	 *
	 * @return An ArrayList containing all bookmarks
	 */
	public abstract ArrayList<Bookmark> getAllBookmarks();

	/**
	 * Inserts or updates a bookmark into the Database
	 *
	 * @param bookmark The updated bookmark to be inserted
	 *
	 * @return True if successful, false if not.
	 */
	public abstract boolean setBookmark(Bookmark bookmark);

	/**
	 * Inserts or Updates a Story in the Database
	 *
	 * @param story The story to push into the Database
	 *
	 * @return True if successful, false if not
	 */
	public abstract boolean setStory(Story story);

	/**
	 * Inserts or pushes a story fragment to the database
	 *
	 * @param frag The fragment to insert or update
	 *
	 * @return True if successful, false if not
	 */
	public abstract boolean setStoryFragment(StoryFragment frag);

}