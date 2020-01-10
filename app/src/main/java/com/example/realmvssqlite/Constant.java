package com.example.realmvssqlite;

import android.provider.BaseColumns;

import java.util.ArrayList;

import io.realm.RealmList;

public final class Constant {

    public static class SampleCard implements BaseColumns {
        public static final String TABLE_NAME = "my_saved_card";
        static final String COLUMN_NAME_ID = "user_id";
        static final String COLUMN_NAME_USER_UNIQUE_ID = "user_unique_id";
        static final String COLUMN_NAME_CARD_ID = "card_id";
        static final String COLUMN_NAME_CARD_NAME = "card_name";
        static final String COLUMN_NAME_CARD_USERNAME = "card_username";
        static final String COLUMN_NAME_CARD_PHONE_NUMBER = "card_phone_number";
        static final String COLUMN_NAME_CARD_COUNTRY_CODE = "card_country_code";
        static final String COLUMN_NAME_CARD_COUNTRY_NAME = "card_country_name";
        static final String COLUMN_NAME_CARD_COMPANY = "card_company";
        static final String COLUMN_NAME_CARD_POSITION = "card_position";
        static final String COLUMN_NAME_CARD_COMPANY_ADDRESS = "card_company_address";
        static final String COLUMN_NAME_CARD_TAGS = "card_tags";
        static final String COLUMN_NAME_CARD_NOTES = "card_notes";
        static final String COLUMN_NAME_CARD_STATUS = "card_status";
        static final String COLUMN_NAME_CARD_IMAGE_URL = "card_image_url";
        static final String COLUMN_NAME_CARD_COMPANY_DESCRIPTION = "card_company_description";
        static final String COLUMN_NAME_CARD_SELLING_INTERESTS = "card_selling_interests";
        static final String COLUMN_NAME_CARD_BUYING_INTERESTS = "card_buying_interests";
        static final String COLUMN_NAME_CARD_CREATED_AT = "card_created_at";
        static final String COLUMN_NAME_CARD_LAST_MODIFIED_AT = "card_last_modified_at";
        static final String COLUMN_NAME_CARD_CONFIRMED_AT = "card_confirmed_at";
        static final String COLUMN_NAME_CARD_IS_DELETED = "card_is_deleted";
        static final String COLUMN_NAME_CARD_IS_NON_SC = "card_is_non_sc";
        static final String COLUMN_NAME_CARD_SC_ID = "card_sc_id";
        static final String COLUMN_NAME_EMAIL = "email";
        static final String COLUMN_NAME_CARD_NON_SC_ID = "card_non_sc_id";
        static final String COLUMN_NAME_EVENT_IDENTIFIER = "show_identifier";
        static final String COLUMN_NAME_UUID = "uuid";
        static final String COLUMN_NAME_EXTRA_FIELDS = "extra_fields";
    }

    public static Card getRandomData() {
        Card card = new Card();

        RealmList<String> _list = new RealmList<>();
        _list.add("asdhufisdhifjhsdjfhd sdjhfjsdhfjsdhf");
        _list.add("asdhufisdhifjhsdjfhd sdjhfjsdhfjsdhf");
        _list.add("asdhufisdhifjhsdjfhd sdjhfjsdhfjsdhf");
        _list.add("asdhufisdhifjhsdjfhd sdjhfjsdhfjsdhf");
        _list.add("asdhufisdhifjhsdjfhd sdjhfjsdhfjsdhf");
        _list.add("asdhufisdhifjhsdjfhd sdjhfjsdhfjsdhf");
        _list.add("asdhufisdhifjhsdjfhd sdjhfjsdhfjsdhf");
        _list.add("asdhufisdhifjhsdjfhd sdjhfjsdhfjsdhf");
        _list.add("asdhufisdhifjhsdjfhd sdjhfjsdhfjsdhf");
        _list.add("asdhufisdhifjhsdjfhd sdjhfjsdhfjsdhf");
        _list.add("asdhufisdhifjhsdjfhd sdjhfjsdhfjsdhf");
        _list.add("asdhufisdhifjhsdjfhd sdjhfjsdhfjsdhf");
        _list.add("asdhufisdhifjhsdjfhd sdjhfjsdhfjsdhf");
        _list.add("asdhufisdhifjhsdjfhd sdjhfjsdhfjsdhf");
        _list.add("asdhufisdhifjhsdjfhd sdjhfjsdhfjsdhf");
        _list.add("asdhufisdhifjhsdjfhd sdjhfjsdhfjsdhf");
        _list.add("asdhufisdhifjhsdjfhd sdjhfjsdhfjsdhf");
        _list.add("asdhufisdhifjhsdjfhd sdjhfjsdhfjsdhf");
        _list.add("asdhufisdhifjhsdjfhd sdjhfjsdhfjsdhf");
        _list.add("asdhufisdhifjhsdjfhd sdjhfjsdhfjsdhf");
        _list.add("asdhufisdhifjhsdjfhd sdjhfjsdhfjsdhf");
        _list.add("asdhufisdhifjhsdjfhd sdjhfjsdhfjsdhf");
        _list.add("asdhufisdhifjhsdjfhd sdjhfjsdhfjsdhf");
        _list.add("asdhufisdhifjhsdjfhd sdjhfjsdhfjsdhf");
        _list.add("asdhufisdhifjhsdjfhd sdjhfjsdhfjsdhf");
        _list.add("asdhufisdhifjhsdjfhd sdjhfjsdhfjsdhf");
        _list.add("asdhufisdhifjhsdjfhd sdjhfjsdhfjsdhf");
        _list.add("asdhufisdhifjhsdjfhd sdjhfjsdhfjsdhf");
        _list.add("asdhufisdhifjhsdjfhd sdjhfjsdhfjsdhf");
        _list.add("asdhufisdhifjhsdjfhd sdjhfjsdhfjsdhf");
        _list.add("asdhufisdhifjhsdjfhd sdjhfjsdhfjsdhf");
        _list.add("asdhufisdhifjhsdjfhd sdjhfjsdhfjsdhf");
        _list.add("asdhufisdhifjhsdjfhd sdjhfjsdhfjsdhf");
        _list.add("asdhufisdhifjhsdjfhd sdjhfjsdhfjsdhf");
        _list.add("asdhufisdhifjhsdjfhd sdjhfjsdhfjsdhf");
        _list.add("asdhufisdhifjhsdjfhd sdjhfjsdhfjsdhf");
        _list.add("asdhufisdhifjhsdjfhd sdjhfjsdhfjsdhf");
        _list.add("asdhufisdhifjhsdjfhd sdjhfjsdhfjsdhf");
        _list.add("asdhufisdhifjhsdjfhd sdjhfjsdhfjsdhf");
        _list.add("asdhufisdhifjhsdjfhd sdjhfjsdhfjsdhf");
        _list.add("asdhufisdhifjhsdjfhd sdjhfjsdhfjsdhf");
        _list.add("asdhufisdhifjhsdjfhd sdjhfjsdhfjsdhf");
        _list.add("asdhufisdhifjhsdjfhd sdjhfjsdhfjsdhf");
        _list.add("asdhufisdhifjhsdjfhd sdjhfjsdhfjsdhf");
        _list.add("asdhufisdhifjhsdjfhd sdjhfjsdhfjsdhf");
        _list.add("asdhufisdhifjhsdjfhd sdjhfjsdhfjsdhf");
        _list.add("asdhufisdhifjhsdjfhd sdjhfjsdhfjsdhf");
        _list.add("asdhufisdhifjhsdjfhd sdjhfjsdhfjsdhf");
        _list.add("asdhufisdhifjhsdjfhd sdjhfjsdhfjsdhf");
        _list.add("asdhufisdhifjhsdjfhd sdjhfjsdhfjsdhf");
        _list.add("asdhufisdhifjhsdjfhd sdjhfjsdhfjsdhf");
        _list.add("asdhufisdhifjhsdjfhd sdjhfjsdhfjsdhf");
        _list.add("asdhufisdhifjhsdjfhd sdjhfjsdhfjsdhf");
        _list.add("asdhufisdhifjhsdjfhd sdjhfjsdhfjsdhf");
        _list.add("asdhufisdhifjhsdjfhd sdjhfjsdhfjsdhf");
        _list.add("asdhufisdhifjhsdjfhd sdjhfjsdhfjsdhf");
        _list.add("asdhufisdhifjhsdjfhd sdjhfjsdhfjsdhf");
        _list.add("asdhufisdhifjhsdjfhd sdjhfjsdhfjsdhf");

        ExtraFields extraFields = new ExtraFields();

        card.setAttendeeType("AAAA");
        card.setBuyingInterests("ada");
        card.setCardId(1);
        card.setCompany("aadss");
        card.setCompanyAddress("adasasd asdsdfdsf fdsasd aw");
        card.setConfirmedAt("aaaa");
        card.setCompanyDescription("sdhfu asdhfjsd fsdfsdfsd fhsd fs fjsdhf s fsdh fjsd fsdjhfsd fhsd sdhfjsdi");
        card.setCountryCode("11111");
        card.setCountryName("SHJDUISS");
        card.setCreatedAt("72345345867489576");
        card.setExtraFields(extraFields);
        card.setImageUrl("http://dasfhsdsdfhsdfhj.com/asdhsfsdfjahd.jpg");
        card.setInSaveCard(true);
        card.setId(2);
        card.setUuId("sdsdkfdsfjsdi-sdfsdf-fsdfsdf");
        card.setNonSampleCard(false);
        card.setName("asdjfsdfsdjf");
        card.setUsername("eeusdsdfarfus");
        card.setTags(_list);
        card.setStatus("sdfsddsffsd");
        card.setSampleCardId(43857348);
        card.setLastModifiedAt("12341234sdfsd567834675");
        card.setShowIdentifier("dfdf, dsdfsdwfsd, wdf");
        card.setNotes("sdufigsdjfsdfsdfsdu sdifjsdkjfksdjfksd sdkfdsfds fhjsdjfsdkjfksdj sdfjsdkfj sdf fsdjfkjsdjfksdfjsdkf sdfjsdkfjsdkfj");
        card.setPosition("3434545sdfsd");
        card.setPhoneNumber("374872384fsdf783274823347");
        return card;
    }
}
