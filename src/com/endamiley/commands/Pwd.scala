package com.endamiley.commands

import com.endamiley.filesystem.State

class Pwd extends Command {

  def apply(state: State): State =
    state.setMessage(state.wd.path)
}
