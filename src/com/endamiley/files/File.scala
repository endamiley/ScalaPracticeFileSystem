package com.endamiley.files

import com.endamiley.filesystem.FileSystemException

class File(override val parentPath: String, override val name: String, contents: String)
  extends DirEntry(parentPath, name) {

  def asDirectory: Directory =
    throw new FileSystemException("File cannot be converted to a directory!")

  def getType: String = "File"

  def asFile: File = this
}

object File {

  def empty(parentPath: String, name: String): File = {
    new File(parentPath, name, "")
  }
}