/**
 * This file is part of Breezy Weather.
 *
 * Breezy Weather is free software: you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as published by the
 * Free Software Foundation, version 3 of the License.
 *
 * Breezy Weather is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
 * or FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public
 * License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with Breezy Weather. If not, see <https://www.gnu.org/licenses/>.
 */

package org.breezyweather.sources.pirateweather.json

import kotlinx.serialization.Serializable

@Serializable
data class PirateWeatherHourly(
    val time: Long,
    val icon: String?,
    val summary: String?,

    val precipType: String?,
    val precipIntensity: Float?,
    val precipProbability: Float?,
    val precipIntensityError: Float?,
    val precipAccumulation: Float?,

    val temperature: Float?,
    val apparentTemperature: Float?,
    val dewPoint: Float?,
    val humidity: Float?,
    val pressure: Float?,
    val windSpeed: Float?,
    val windGust: Float?,
    val windBearing: Float?,
    val uvIndex: Float?,
    val cloudCover: Float?,
    val visibility: Float?
)
