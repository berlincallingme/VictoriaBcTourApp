package com.example.brand.victoriabctourapp;

public class Attractions{
        /** String resource ID for the Attraction Name */
        private int mAttractionNameId;

        /** String resource ID for the Attraction Description */
        private int mAttractionInfoId;

        /** Image resource ID for the word */
        private int mImageResourceId;
        /**
         * Create a new Attraction object.
         *
         * @param attractionInfoId is the string resource ID for the attraction info
         * @param attractionNameId is the string resource Id attraction name
         * @param imageResourceId is the resource ID for the image with this ID
         */
        public Attractions(int attractionNameId, int attractionInfoId, int imageResourceId) {
            mAttractionNameId = attractionNameId;
            mAttractionInfoId = attractionInfoId;
            mImageResourceId = imageResourceId;
        }



        /**
         * Get the string resource ID for the default translation of the word.
         */
        public int getAttractionName() {
            return mAttractionNameId;
        }

        /**
         * Get the string resource ID for the Miwok translation of the word.
         */
        public int getAttractionInfo() {
            return mAttractionInfoId;
        }

        /**
         * Return the image resource ID of the word.
         */
        public int getImageResourceId() {
            return mImageResourceId;
        }

}