# ART-PlaceholderAPI

[![Build Status](https://github.com/art-framework/art-placeholderapi/workflows/Build/badge.svg)](../../actions?query=workflow%3ABuild)
[![GitHub release (latest SemVer including pre-releases)](https://img.shields.io/github/v/release/art-framework/art-placeholderapi?include_prereleases&label=release)](../../releases)
[![Commitizen friendly](https://img.shields.io/badge/commitizen-friendly-brightgreen.svg)](http://commitizen.github.io/cz-cli/)
[![semantic-release](https://img.shields.io/badge/%20%20%F0%9F%93%A6%F0%9F%9A%80-semantic--release-e10079.svg)](https://github.com/semantic-release/semantic-release)
[![art-framework-badge](https://raw.githubusercontent.com/gist/Silthus/a88fd35b722da343658d54c474c0e5c1/raw/586ba19363678ffc6880de679490f8abb6db3f19/badge.svg)](https://art-framework.io)

This [art-framework](https://art-framework.io) module provides easy replacements for all placeholders of the [PlaceholderAPI](https://github.com/PlaceholderAPI/PlaceholderAPI/) in your art-configurations.

Here is the exact example from the [PlaceholderAPI documentation](https://github.com/PlaceholderAPI/PlaceholderAPI/wiki/Hook-into-PlaceholderAPI#setting-placeholders-in-your-plugin) implemented in the art-framework.

The following art-script will broadcast the given message when a player joins the server and replaces the placeholders.

```yaml
art:
  - '@player.join'
  - '!broadcast "%player_name% &ajoined the server! They are rank &f%vault_rank%"'
```
