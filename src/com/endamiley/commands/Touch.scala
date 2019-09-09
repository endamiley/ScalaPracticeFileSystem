package com.endamiley.commands

import com.endamiley.files.{DirEntry, File}
import com.endamiley.filesystem.State

class Touch(name: String) extends CreateEntry(name) {

  override def createSpecificEntry(state: State): DirEntry =
    File.empty(state.wd.path, name)
}
