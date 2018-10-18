package com.example.kanzeparovrr.postterminalcardapplicationmir.iso7816emv;

import com.example.kanzeparovrr.postterminalcardapplicationmir.enums.TagTypeEnum;
import com.example.kanzeparovrr.postterminalcardapplicationmir.enums.TagValueTypeEnum;


public interface ITag {

	enum Class {
		UNIVERSAL, APPLICATION, CONTEXT_SPECIFIC, PRIVATE
	}

	boolean isConstructed();

	byte[] getTagBytes();

	String getName();

	String getDescription();

	TagTypeEnum getType();

	TagValueTypeEnum getTagValueType();

	Class getTagClass();

	int getNumTagBytes();

}
