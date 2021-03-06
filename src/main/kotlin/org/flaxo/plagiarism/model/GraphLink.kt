package org.flaxo.plagiarism.model

import kotlinx.serialization.Optional
import kotlinx.serialization.Serializable
import org.flaxo.plagiarism.support.DirectionSerializer

/**
 * Graph link.
 *
 * Represents a weighed connection between two graph nodes.
 *
 * Graph link is bidirectional.
 */
@Serializable
class GraphLink(

        /**
         * First of the link's nodes name.
         */
        val first: String,

        /**
         * Second of the link's nodes name.
         */
        val second: String,

        /**
         * Link weight.
         *
         * Represents the nodes closeness value. It lies *between 0 and 100*.
         *
         * *The higher weight the closer nodes are.*
         */
        val weight: Int,

        /**
         * Direction of the link
         */
        @Optional
        @Serializable(with = DirectionSerializer::class)
        val directedTo: Direction? = null,

        /**
         * Link details web URL.
         */
        @Optional
        val url: String? = null
)
