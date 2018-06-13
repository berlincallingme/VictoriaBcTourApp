package com.example.brand.victoriabctourapp;

public class Attractions{

        private int mAttractionNameId;

        private int mAttractionInfoId;

        private int mImageResourceId;

        public Attractions(int attractionNameId, int attractionInfoId, int imageResourceId) {
            mAttractionNameId = attractionNameId;
            mAttractionInfoId = attractionInfoId;
            mImageResourceId = imageResourceId;
        }



        public int getAttractionName() {
            return mAttractionNameId;
        }

        public int getAttractionInfo() {
            return mAttractionInfoId;
        }


        public int getImageResourceId() {
            return mImageResourceId;
        }

}