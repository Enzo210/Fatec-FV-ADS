<?php

// autoload_static.php @generated by Composer

namespace Composer\Autoload;

class ComposerStaticInit59f19e859bcbbc8817b6cd4671735a08
{
    public static $prefixLengthsPsr4 = array (
        'A' => 
        array (
            'Aula11\\Avc\\' => 11,
        ),
    );

    public static $prefixDirsPsr4 = array (
        'Aula11\\Avc\\' => 
        array (
            0 => __DIR__ . '/../..' . '/src',
        ),
    );

    public static $classMap = array (
        'Composer\\InstalledVersions' => __DIR__ . '/..' . '/composer/InstalledVersions.php',
    );

    public static function getInitializer(ClassLoader $loader)
    {
        return \Closure::bind(function () use ($loader) {
            $loader->prefixLengthsPsr4 = ComposerStaticInit59f19e859bcbbc8817b6cd4671735a08::$prefixLengthsPsr4;
            $loader->prefixDirsPsr4 = ComposerStaticInit59f19e859bcbbc8817b6cd4671735a08::$prefixDirsPsr4;
            $loader->classMap = ComposerStaticInit59f19e859bcbbc8817b6cd4671735a08::$classMap;

        }, null, ClassLoader::class);
    }
}
