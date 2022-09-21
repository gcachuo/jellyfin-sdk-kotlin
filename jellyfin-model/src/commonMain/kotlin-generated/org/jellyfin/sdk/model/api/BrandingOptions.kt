// !!        WARNING
// !! DO NOT EDIT THIS FILE
//
// This file is generated by the openapi-generator module and is not meant for manual changes.
// Please read the README.md file in the openapi-generator module for additional information.
package org.jellyfin.sdk.model.api

import kotlin.Boolean
import kotlin.String
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * The branding options.
 */
@Serializable
public data class BrandingOptions(
	/**
	 * The login disclaimer.
	 */
	@SerialName("LoginDisclaimer")
	public val loginDisclaimer: String? = null,
	/**
	 * The custom CSS.
	 */
	@SerialName("CustomCss")
	public val customCss: String? = null,
	/**
	 * A value indicating whether to enable the splashscreen.
	 */
	@SerialName("SplashscreenEnabled")
	public val splashscreenEnabled: Boolean,
)
