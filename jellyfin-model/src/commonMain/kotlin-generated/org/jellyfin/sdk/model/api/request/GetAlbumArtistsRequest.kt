// !!        WARNING
// !! DO NOT EDIT THIS FILE
//
// This file is generated by the openapi-generator module and is not meant for manual changes.
// Please read the README.md file in the openapi-generator module for additional information.
@file:UseSerializers(UUIDSerializer::class)

package org.jellyfin.sdk.model.api.request

import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.String
import kotlin.collections.Collection
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers
import org.jellyfin.sdk.model.UUID
import org.jellyfin.sdk.model.api.BaseItemKind
import org.jellyfin.sdk.model.api.ImageType
import org.jellyfin.sdk.model.api.ItemFields
import org.jellyfin.sdk.model.api.ItemFilter
import org.jellyfin.sdk.model.api.SortOrder
import org.jellyfin.sdk.model.serializer.UUIDSerializer

/**
 * All album artists from a given item, folder, or the entire library.
 */
@Serializable
public data class GetAlbumArtistsRequest(
	/**
	 * Optional filter by minimum community rating.
	 */
	@SerialName("minCommunityRating")
	public val minCommunityRating: Double? = null,
	/**
	 * Optional. The record index to start at. All items with a lower index will be dropped from the
	 * results.
	 */
	@SerialName("startIndex")
	public val startIndex: Int? = null,
	/**
	 * Optional. The maximum number of records to return.
	 */
	@SerialName("limit")
	public val limit: Int? = null,
	/**
	 * Optional. Search term.
	 */
	@SerialName("searchTerm")
	public val searchTerm: String? = null,
	/**
	 * Specify this to localize the search to a specific item or folder. Omit to use the root.
	 */
	@SerialName("parentId")
	public val parentId: UUID? = null,
	/**
	 * Optional. Specify additional fields of information to return in the output.
	 */
	@SerialName("fields")
	public val fields: Collection<ItemFields>? = null,
	/**
	 * Optional. If specified, results will be filtered out based on item type. This allows multiple,
	 * comma delimited.
	 */
	@SerialName("excludeItemTypes")
	public val excludeItemTypes: Collection<BaseItemKind>? = null,
	/**
	 * Optional. If specified, results will be filtered based on item type. This allows multiple, comma
	 * delimited.
	 */
	@SerialName("includeItemTypes")
	public val includeItemTypes: Collection<BaseItemKind>? = null,
	/**
	 * Optional. Specify additional filters to apply.
	 */
	@SerialName("filters")
	public val filters: Collection<ItemFilter>? = null,
	/**
	 * Optional filter by items that are marked as favorite, or not.
	 */
	@SerialName("isFavorite")
	public val isFavorite: Boolean? = null,
	/**
	 * Optional filter by MediaType. Allows multiple, comma delimited.
	 */
	@SerialName("mediaTypes")
	public val mediaTypes: Collection<String>? = null,
	/**
	 * Optional. If specified, results will be filtered based on genre. This allows multiple, pipe
	 * delimited.
	 */
	@SerialName("genres")
	public val genres: Collection<String>? = null,
	/**
	 * Optional. If specified, results will be filtered based on genre id. This allows multiple, pipe
	 * delimited.
	 */
	@SerialName("genreIds")
	public val genreIds: Collection<UUID>? = null,
	/**
	 * Optional. If specified, results will be filtered based on OfficialRating. This allows multiple,
	 * pipe delimited.
	 */
	@SerialName("officialRatings")
	public val officialRatings: Collection<String>? = null,
	/**
	 * Optional. If specified, results will be filtered based on tag. This allows multiple, pipe
	 * delimited.
	 */
	@SerialName("tags")
	public val tags: Collection<String>? = null,
	/**
	 * Optional. If specified, results will be filtered based on production year. This allows multiple,
	 * comma delimited.
	 */
	@SerialName("years")
	public val years: Collection<Int>? = null,
	/**
	 * Optional, include user data.
	 */
	@SerialName("enableUserData")
	public val enableUserData: Boolean? = null,
	/**
	 * Optional, the max number of images to return, per image type.
	 */
	@SerialName("imageTypeLimit")
	public val imageTypeLimit: Int? = null,
	/**
	 * Optional. The image types to include in the output.
	 */
	@SerialName("enableImageTypes")
	public val enableImageTypes: Collection<ImageType>? = null,
	/**
	 * Optional. If specified, results will be filtered to include only those containing the specified
	 * person.
	 */
	@SerialName("person")
	public val person: String? = null,
	/**
	 * Optional. If specified, results will be filtered to include only those containing the specified
	 * person ids.
	 */
	@SerialName("personIds")
	public val personIds: Collection<UUID>? = null,
	/**
	 * Optional. If specified, along with Person, results will be filtered to include only those
	 * containing the specified person and PersonType. Allows multiple, comma-delimited.
	 */
	@SerialName("personTypes")
	public val personTypes: Collection<String>? = null,
	/**
	 * Optional. If specified, results will be filtered based on studio. This allows multiple, pipe
	 * delimited.
	 */
	@SerialName("studios")
	public val studios: Collection<String>? = null,
	/**
	 * Optional. If specified, results will be filtered based on studio id. This allows multiple, pipe
	 * delimited.
	 */
	@SerialName("studioIds")
	public val studioIds: Collection<UUID>? = null,
	/**
	 * User id.
	 */
	@SerialName("userId")
	public val userId: UUID? = null,
	/**
	 * Optional filter by items whose name is sorted equally or greater than a given input string.
	 */
	@SerialName("nameStartsWithOrGreater")
	public val nameStartsWithOrGreater: String? = null,
	/**
	 * Optional filter by items whose name is sorted equally than a given input string.
	 */
	@SerialName("nameStartsWith")
	public val nameStartsWith: String? = null,
	/**
	 * Optional filter by items whose name is equally or lesser than a given input string.
	 */
	@SerialName("nameLessThan")
	public val nameLessThan: String? = null,
	/**
	 * Optional. Specify one or more sort orders, comma delimited.
	 */
	@SerialName("sortBy")
	public val sortBy: Collection<String>? = null,
	/**
	 * Sort Order - Ascending,Descending.
	 */
	@SerialName("sortOrder")
	public val sortOrder: Collection<SortOrder>? = null,
	/**
	 * Optional, include image information in output.
	 */
	@SerialName("enableImages")
	public val enableImages: Boolean? = true,
	/**
	 * Total record count.
	 */
	@SerialName("enableTotalRecordCount")
	public val enableTotalRecordCount: Boolean? = true,
)
