package dev.olgiati.subsonik.service

import dev.olgiati.subsonik.model._base.SubsonicError

class SubsonikException(val error: SubsonicError) : Exception()