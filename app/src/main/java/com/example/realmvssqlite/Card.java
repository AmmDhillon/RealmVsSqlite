package com.example.realmvssqlite;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

import io.realm.RealmList;
import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

public class Card extends RealmObject {

    @PrimaryKey
    private Long primaryKey;

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("email")
    @Expose
    private String username;
    @SerializedName("phone_number")
    @Expose
    private String phoneNumber;
    @SerializedName("company")
    @Expose
    private String company;
    @SerializedName("position")
    @Expose
    private String position;
    @SerializedName("company_address")
    @Expose
    private String companyAddress;
    @SerializedName("tags")
    @Expose
    private RealmList<String> tags = null;
    @SerializedName("notes")
    @Expose
    private String notes;
    @SerializedName("card_id")
    @Expose
    private Integer cardId;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("image_url")
    @Expose
    private String imageUrl;
    @SerializedName("buying_interests")
    @Expose
    private String buyingInterests;
    @SerializedName("selling_interests")
    @Expose
    private String sellingInterests;
    @SerializedName("company_description")
    @Expose
    private String companyDescription;
    private boolean inSaveCard;
    @SerializedName("country_name")
    @Expose
    private String countryName;
    @SerializedName("country_code")
    @Expose
    private String countryCode;
    @SerializedName("confirmed_at")
    @Expose
    private String confirmedAt;
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("last_modified_at")
    @Expose
    private String lastModifiedAt;
    @SerializedName("sc_id")
    @Expose
    private Integer SampleCardId;
    @SerializedName("is_non_sc")
    @Expose
    private boolean isNonSampleCard;
    @SerializedName("non_sc_id")
    @Expose
    private Integer nonSampleCardID;
    @SerializedName("attendee_type")
    @Expose
    private String attendeeType;
    @SerializedName("show_identifier")
    @Expose
    private String showIdentifier;
    @SerializedName("uuid")
    @Expose
    private String uuId;
    @SerializedName("extra_fields")
    @Expose
    private ExtraFields extraFields;

    public Card() {

    }

    public void setPrimaryKey(Long primaryKey) {
        this.primaryKey = primaryKey;
    }

    //    protected Card(Parcel in) {
//        if (in.readByte() == 0) {
//            id = null;
//        } else {
//            id = in.readInt();
//        }
//        name = in.readString();
//        username = in.readString();
//        phoneNumber = in.readString();
//        company = in.readString();
//        position = in.readString();
//        companyAddress = in.readString();
//        tags = in.createStringArrayList();
//        notes = in.readString();
//        if (in.readByte() == 0) {
//            cardId = null;
//        } else {
//            cardId = in.readInt();
//        }
//        status = in.readString();
//        imageUrl = in.readString();
//        buyingInterests = in.readString();
//        sellingInterests = in.readString();
//        companyDescription = in.readString();
//        inSaveCard = in.readByte() != 0;
//        countryName = in.readString();
//        countryCode = in.readString();
//        confirmedAt = in.readString();
//        createdAt = in.readString();
//        lastModifiedAt = in.readString();
//        if (in.readByte() == 0) {
//            SampleCardId = null;
//        } else {
//            SampleCardId = in.readInt();
//        }
//        isNonSampleCard = in.readByte() != 0;
//        if (in.readByte() == 0) {
//            nonSampleCardID = null;
//        } else {
//            nonSampleCardID = in.readInt();
//        }
//        attendeeType = in.readString();
//        showIdentifier = in.readString();
//        uuId = in.readString();
//    }

//    public static final Creator<Card> CREATOR = new Creator<Card>() {
//        @Override
//        public Card createFromParcel(Parcel in) {
//            return new Card(in);
//        }
//
//        @Override
//        public Card[] newArray(int size) {
//            return new Card[size];
//        }
//    };

    public ExtraFields getExtraFields() {
        return extraFields;
    }

    public void setExtraFields(ExtraFields extraFields) {
        this.extraFields = extraFields;
    }

    public String getUuId() {
        return uuId;
    }

    public void setUuId(String uuId) {
        this.uuId = uuId;
    }

    public String getAttendeeType() {
        return attendeeType;
    }

    public void setAttendeeType(String attendeeType) {
        this.attendeeType = attendeeType;
    }

    public Integer getNonSampleCardID() {
        return nonSampleCardID;
    }

    public void setNonSampleCardID(Integer nonSampleCardID) {
        this.nonSampleCardID = nonSampleCardID;
    }

    public String getShowIdentifier() {
        return showIdentifier;
    }

    public void setShowIdentifier(String showIdentifier) {
        this.showIdentifier = showIdentifier;
    }

    public Card(Integer id, String name, String company, String position, String username, String phoneNumber, String companyAddress) {
        this.id = id;
        this.name = name;
        this.username = username;
        this.phoneNumber = phoneNumber;
        this.company = company;
        this.position = position;
        this.companyAddress = companyAddress;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getCompanyAddress() {
        return companyAddress;
    }

    public void setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress;
    }

    public RealmList<String> getTags() {
        return tags;
    }

    public void setTags(RealmList<String> tags) {
        this.tags = tags;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public Integer getCardId() {
        return cardId;
    }

    public void setCardId(Integer cardId) {
        this.cardId = cardId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public boolean isInSaveCard() {
        return inSaveCard;
    }

    public void setInSaveCard(boolean inSaveCard) {
        this.inSaveCard = inSaveCard;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getBuyingInterests() {
        return buyingInterests;
    }

    public void setBuyingInterests(String buyingInterests) {
        this.buyingInterests = buyingInterests;
    }

    public String getSellingInterests() {
        return sellingInterests;
    }

    public void setSellingInterests(String sellingInterests) {
        this.sellingInterests = sellingInterests;
    }

    public String getCompanyDescription() {
        return companyDescription;
    }

    public void setCompanyDescription(String companyDescription) {
        this.companyDescription = companyDescription;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getConfirmedAt() {
        return confirmedAt;
    }

    public void setConfirmedAt(String confirmedAt) {
        this.confirmedAt = confirmedAt;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getLastModifiedAt() {
        return lastModifiedAt;
    }

    public void setLastModifiedAt(String lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
    }

    public Integer getSampleCardId() {
        return SampleCardId;
    }

    public void setSampleCardId(Integer SampleCardId) {
        this.SampleCardId = SampleCardId;
    }

    public boolean isNonSampleCard() {
        return isNonSampleCard;
    }

    public void setNonSampleCard(boolean nonSampleCard) {
        isNonSampleCard = nonSampleCard;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Card card = (Card) o;
        if (!isNonSampleCard) {
            if (uuId != null && card.uuId != null) {
                return uuId.equals(card.uuId);
            } else
                return id != null && card.id != null && id.equals(card.id);
        } else {
            return SampleCardId != null && card.SampleCardId != null &&
                    SampleCardId.equals(card.SampleCardId);
        }
    }

    @Override
    public int hashCode() {
        if (id != null) {
            return id.hashCode();
        } else {
            return uuId.hashCode();
        }
    }

    @Override
    public String toString() {
        return "Card{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", username='" + username + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", company='" + company + '\'' +
                ", position='" + position + '\'' +
                ", companyAddress='" + companyAddress + '\'' +
                ", tags=" + tags +
                ", notes='" + notes + '\'' +
                ", cardId=" + cardId +
                ", status='" + status + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                ", attendeeType='" + attendeeType + '\'' +
                ", buyingInterests='" + buyingInterests + '\'' +
                ", sellingInterests='" + sellingInterests + '\'' +
                ", companyDescription='" + companyDescription + '\'' +
                ", inSaveCard=" + inSaveCard +
                ", countryName='" + countryName + '\'' +
                ", countryCode='" + countryCode + '\'' +
                ", confirmedAt='" + confirmedAt + '\'' +
                ", createdAt='" + createdAt + '\'' +
                ", lastModifiedAt='" + lastModifiedAt + '\'' +
                ", SampleCardId=" + SampleCardId +
                ", isNonSampleCard=" + isNonSampleCard +
                ", nonSampleCardID=" + nonSampleCardID +
                ", showIdentifier=" + showIdentifier +
                ", uuId=" + uuId +
                ", extraFields=" + extraFields +
                '}';
    }

//    @Override
//    public int describeContents() {
//        return 0;
//    }
//
//    @Override
//    public void writeToParcel(Parcel dest, int flags) {
//        if (id == null) {
//            dest.writeByte((byte) 0);
//        } else {
//            dest.writeByte((byte) 1);
//            dest.writeInt(id);
//        }
//        dest.writeString(name);
//        dest.writeString(username);
//        dest.writeString(phoneNumber);
//        dest.writeString(company);
//        dest.writeString(position);
//        dest.writeString(companyAddress);
//        dest.writeStringList(tags);
//        dest.writeString(notes);
//        if (cardId == null) {
//            dest.writeByte((byte) 0);
//        } else {
//            dest.writeByte((byte) 1);
//            dest.writeInt(cardId);
//        }
//        dest.writeString(status);
//        dest.writeString(imageUrl);
//        dest.writeString(buyingInterests);
//        dest.writeString(sellingInterests);
//        dest.writeString(companyDescription);
//        dest.writeByte((byte) (inSaveCard ? 1 : 0));
//        dest.writeString(countryName);
//        dest.writeString(countryCode);
//        dest.writeString(confirmedAt);
//        dest.writeString(createdAt);
//        dest.writeString(lastModifiedAt);
//        if (SampleCardId == null) {
//            dest.writeByte((byte) 0);
//        } else {
//            dest.writeByte((byte) 1);
//            dest.writeInt(SampleCardId);
//        }
//        dest.writeByte((byte) (isNonSampleCard ? 1 : 0));
//        if (nonSampleCardID == null) {
//            dest.writeByte((byte) 0);
//        } else {
//            dest.writeByte((byte) 1);
//            dest.writeInt(nonSampleCardID);
//        }
//        dest.writeString(attendeeType);
//        dest.writeString(showIdentifier);
//        dest.writeString(uuId);
//    }
}