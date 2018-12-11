package com.avast.android.butterknifezelezny.butterknife;

import java.util.regex.Pattern;

/**
 * ButterKnife version 8
 *
 * @author Tomáš Kypta
 * @since 1.5.0
 */
public class Xutils3 implements IButterKnife {

    //注解时候采用的名称
    private static final String mFieldAnnotationSimpleName = "ViewInject";
    private static final String mSimpleBindStatement = "x.view().inject";
    private static final String mSimpleUnbindStatement = ".unbind";
    private static final String mUnbinderClassSimpleName = "View";

    //引用库的名称
    private static final String mPackageName = "org.xutils";
    private final Pattern mFieldAnnotationPattern = Pattern.compile("^@" + getFieldAnnotationSimpleName() + "\\(([^\\)]+)\\)$", Pattern.CASE_INSENSITIVE);
    private final String mFieldAnnotationCanonicalName = getFieldAnnotationSimpleName();
    private final String mCanonicalBindStatement = getSimpleBindStatement();
    private final String mCanonicalUnbindStatement = getPackageName() + "." + getSimpleUnbindStatement();
    private final String mOnClickCanonicalName = "Event";
    private final String mUnbinderClassCanonicalName =getUnbinderClassSimpleName();



    @Override
    public String getVersion() {
        return "3.0.1";
    }

    @Override
    public String getDistinctClassName() {
        return mPackageName+"."+"ViewInjector";
    }

    @Override
    public String getFieldAnnotationSimpleName() {
        return mFieldAnnotationSimpleName;
    }

    @Override
    public String getSimpleBindStatement() {
        return mSimpleBindStatement;
    }

    @Override
    public String getSimpleUnbindStatement() {
        return mSimpleUnbindStatement;
    }

    @Override
    public String getCanonicalUnbindStatement() {
        return getSimpleUnbindStatement();
    }

    @Override
    public String getUnbinderClassSimpleName() {
        return mUnbinderClassSimpleName;
    }


    @Override
    public Pattern getFieldAnnotationPattern() {
        return mFieldAnnotationPattern;
    }

    @Override
    public String getPackageName() {
        return mPackageName;
    }

    @Override
    public String getFieldAnnotationCanonicalName() {
        return mFieldAnnotationCanonicalName;
    }

    @Override
    public String getOnClickAnnotationCanonicalName() {
        return mOnClickCanonicalName;
    }

    @Override
    public String getCanonicalBindStatement() {
        return mCanonicalBindStatement;
    }

    @Override
    public boolean isUnbindSupported() {
        return false;
    }

    @Override
    public boolean isUsingUnbinder() {
        // Let's assume that this is going to stay after ButterKnife 8.
        return false;
    }

    @Override
    public String getUnbinderClassCanonicalName() {
        return mUnbinderClassCanonicalName;
    }
}
