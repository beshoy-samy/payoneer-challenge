//
// Created by Beshoy Samy on 9/19/2021.
//
#include <jni.h>
#include <string>

extern "C" JNIEXPORT jstring
JNICALL
Java_com_paynoneer_network_NetworkKeys_getBaseUrl(JNIEnv *env, jclass object) {
    std::string baseUrl = "https://raw.githubusercontent.com/";
    return env->NewStringUTF(baseUrl.c_str());
}